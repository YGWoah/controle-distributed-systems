package me.massoudi.conferenceservice.dto;


import java.time.LocalDate;
import java.util.List;

public class ConferenceDTO {
    private Long id;
    private String title;
    private String type;
    private LocalDate date;
    private int duration;
    private int numberOfAttendees;
    private double score;
    private List<ReviewDTO> reviews;

    // Getters and Setters
}
