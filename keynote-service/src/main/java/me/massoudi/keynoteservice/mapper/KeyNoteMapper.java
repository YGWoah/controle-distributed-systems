package me.massoudi.keynoteservice.mapper;

import me.massoudi.keynoteservice.dto.KeyNoteDTO;
import me.massoudi.keynoteservice.model.KeyNote;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KeyNoteMapper {
    KeyNoteDTO toDTO(KeyNote keynote);
    KeyNote toEntity(KeyNoteDTO keynoteDTO);
}
