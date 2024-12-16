package me.massoudi.conferenceservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
