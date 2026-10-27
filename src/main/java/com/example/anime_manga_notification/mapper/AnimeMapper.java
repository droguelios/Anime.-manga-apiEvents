package com.example.anime_manga_notification.mapper;
import com.example.anime_manga_notification.dto.anime.AnimeCreateDto;
import com.example.anime_manga_notification.dto.anime.AnimeResponseDto;
import com.example.anime_manga_notification.dto.anime.AnimeUpdateDto;
import com.example.anime_manga_notification.entity.Anime;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import javax.swing.text.html.parser.Entity;

@Mapper (componentModel = "spring")
public interface AnimeMapper {
    @Mapping(target = "createdAt" , ignore = true)
    @Mapping(target = "updatedAt" , ignore = true)
    @Mapping (target = "id" , ignore = true)
    @Mapping(target = "releaseDate", ignore = true)
    @Mapping(target = "lastEpisodeReleaseDate", ignore = true)
    @Mapping(target = "studio", ignore = true)
    Anime toEntity(AnimeCreateDto dto);
    void toUpdateDto(AnimeUpdateDto animeUpdateDto , @MappingTarget Anime anime);

    AnimeResponseDto toResponseDto(Anime anime);

    List<AnimeResponseDto> toResponseDtoList(List<Anime> animeList);
}
