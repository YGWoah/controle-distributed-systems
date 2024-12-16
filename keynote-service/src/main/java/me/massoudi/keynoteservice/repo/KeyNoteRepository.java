package me.massoudi.keynoteservice.repo;

import me.massoudi.keynoteservice.model.KeyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyNoteRepository extends JpaRepository<KeyNote, Long> {
}
