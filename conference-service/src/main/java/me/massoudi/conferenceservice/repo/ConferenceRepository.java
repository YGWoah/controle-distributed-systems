package me.massoudi.conferenceservice.repo;


import me.massoudi.conferenceservice.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
