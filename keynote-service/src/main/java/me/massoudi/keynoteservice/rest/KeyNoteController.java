package me.massoudi.keynoteservice.rest;

import lombok.AllArgsConstructor;
import me.massoudi.keynoteservice.dto.KeyNoteDTO;
import me.massoudi.keynoteservice.mapper.KeyNoteMapper;
import me.massoudi.keynoteservice.model.KeyNote;
import me.massoudi.keynoteservice.services.KeyNoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/keynotes")
@AllArgsConstructor
public class KeyNoteController {
    private KeyNoteService service;
    private KeyNoteMapper mapper;

    @GetMapping
    public List<KeyNoteDTO> getAllKeyNotes() {
        return service.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<KeyNoteDTO> getKeyNoteById(@PathVariable Long id) {
        Optional<KeyNote> keynote = service.findById(id);
        return keynote.map(value -> ResponseEntity.ok(mapper.toDTO(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public KeyNoteDTO createKeyNote(@RequestBody KeyNoteDTO keynoteDTO) {
        KeyNote keynote = mapper.toEntity(keynoteDTO);
        return mapper.toDTO(service.save(keynote));
    }

    @PutMapping("/{id}")
    public ResponseEntity<KeyNoteDTO> updateKeyNote(@PathVariable Long id, @RequestBody KeyNoteDTO keynoteDTO) {
        Optional<KeyNote> existingKeyNote = service.findById(id);
        if (existingKeyNote.isPresent()) {
            KeyNote keynote = mapper.toEntity(keynoteDTO);
            keynote.setId(id);
            return ResponseEntity.ok(mapper.toDTO(service.save(keynote)));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKeyNote(@PathVariable Long id) {
        if (service.existsById(id)) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
