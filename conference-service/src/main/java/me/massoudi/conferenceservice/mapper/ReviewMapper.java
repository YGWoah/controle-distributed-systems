package me.massoudi.conferenceservice.mapper;


import me.massoudi.conferenceservice.dto.ReviewDTO;
import me.massoudi.conferenceservice.model.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper {
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    ReviewDTO toDTO(Review review);
    Review toEntity(ReviewDTO reviewDTO);
}
