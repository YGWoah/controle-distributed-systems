package me.massoudi.conferenceservice.service;


import lombok.AllArgsConstructor;
import me.massoudi.conferenceservice.model.Conference;
import me.massoudi.conferenceservice.repo.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConferenceService {
    private ConferenceRepository conferenceRepository;

    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    public Optional<Conference> findById(Long id) {
        return conferenceRepository.findById(id);
    }

    public Conference save(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public void deleteById(Long id) {
        conferenceRepository.deleteById(id);
    }
}
