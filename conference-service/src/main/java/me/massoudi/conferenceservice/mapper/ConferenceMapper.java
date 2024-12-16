package me.massoudi.conferenceservice.mapper;


import me.massoudi.conferenceservice.dto.ConferenceDTO;
import me.massoudi.conferenceservice.model.Conference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConferenceMapper {
    ConferenceMapper INSTANCE = Mappers.getMapper(ConferenceMapper.class);

    ConferenceDTO toDTO(Conference conference);
    Conference toEntity(ConferenceDTO conferenceDTO);
}
