package me.massoudi.keynoteservice.dto;

import lombok.Data;

@Data
public class KeyNoteDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String function;
}
