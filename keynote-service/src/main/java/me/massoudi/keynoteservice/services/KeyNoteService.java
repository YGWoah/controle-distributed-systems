package me.massoudi.keynoteservice.services;

import lombok.AllArgsConstructor;
import me.massoudi.keynoteservice.model.KeyNote;
import me.massoudi.keynoteservice.repo.KeyNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class KeyNoteService {
    private KeyNoteRepository repository;

    public List<KeyNote> findAll() {
        return repository.findAll();
    }

    public Optional<KeyNote> findById(Long id) {
        return repository.findById(id);
    }

    public KeyNote save(KeyNote keynote) {
        return repository.save(keynote);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return repository.existsById(id);
    }
}
