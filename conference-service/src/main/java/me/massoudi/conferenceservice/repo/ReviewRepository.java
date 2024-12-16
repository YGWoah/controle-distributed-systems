package me.massoudi.conferenceservice.repo;


import me.massoudi.conferenceservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
