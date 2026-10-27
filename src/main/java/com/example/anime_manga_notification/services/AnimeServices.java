package com.example.anime_manga_notification.services;

import com.example.anime_manga_notification.dto.anime.AnimeCreateDto;
import com.example.anime_manga_notification.dto.anime.AnimeResponseDto;
import com.example.anime_manga_notification.dto.anime.AnimeUpdateDto;
import com.example.anime_manga_notification.entity.Anime;
import com.example.anime_manga_notification.mapper.AnimeMapper;
import com.example.anime_manga_notification.repository.AnimeRepository;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.ErrorResponseException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnimeServices {

    private final AnimeRepository animeRepository;
    private  final AnimeMapper animeMapper;

    @Transactional(readOnly = true)
    public List<AnimeResponseDto> findAll() {
        return animeMapper.toResponseDtoList(animeRepository.findAll());
    }

    @Transactional
    public AnimeResponseDto save(AnimeCreateDto animeCreateDto){
        Anime anime = animeMapper.toEntity(animeCreateDto);
        Anime animeSaved = animeRepository.save(anime);
        return animeMapper.toResponseDto(animeSaved);
    }

    @Transactional
    public void delete (Long id) {
        if (id == null || !animeRepository.existsById(id)){
            throw new ResourceNotFoundException("this id does not exist");
        }
        animeRepository.deleteById(id);
    }

    @Transactional
    public AnimeResponseDto update (Long id ,AnimeUpdateDto animeUpdateDto){
        Anime existingAnime = animeRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Anime not found with this id" + id));

        animeMapper.toUpdateDto(animeUpdateDto, existingAnime);

        Anime updateAnime = animeRepository.save(existingAnime);

        return animeMapper.toResponseDto(updateAnime);



    }
}
