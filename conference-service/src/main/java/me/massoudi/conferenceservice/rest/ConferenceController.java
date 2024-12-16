package me.massoudi.conferenceservice.rest;


import me.massoudi.conferenceservice.dto.ConferenceDTO;
import me.massoudi.conferenceservice.mapper.ConferenceMapper;
import me.massoudi.conferenceservice.model.Conference;
import me.massoudi.conferenceservice.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/conferences")
public class ConferenceController {
    @Autowired
    private ConferenceService conferenceService;

    @GetMapping
    public List<ConferenceDTO> getAllConferences() {
        return conferenceService.findAll().stream()
                .map(ConferenceMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ConferenceDTO getConferenceById(@PathVariable Long id) {
        return conferenceService.findById(id)
                .map(ConferenceMapper.INSTANCE::toDTO)
                .orElse(null);
    }

    @PostMapping
    public ConferenceDTO createConference(@RequestBody ConferenceDTO conferenceDTO) {
        Conference conference = ConferenceMapper.INSTANCE.toEntity(conferenceDTO);
        return ConferenceMapper.INSTANCE.toDTO(conferenceService.save(conference));
    }

    @PutMapping("/{id}")
    public ConferenceDTO updateConference(@PathVariable Long id, @RequestBody ConferenceDTO conferenceDTO) {
        Conference conference = ConferenceMapper.INSTANCE.toEntity(conferenceDTO);
        conference.setId(id);
        return ConferenceMapper.INSTANCE.toDTO(conferenceService.save(conference));
    }

    @DeleteMapping("/{id}")
    public void deleteConference(@PathVariable Long id) {
        conferenceService.deleteById(id);
    }
}
