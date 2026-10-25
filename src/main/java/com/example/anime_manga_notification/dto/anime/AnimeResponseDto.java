package com.example.anime_manga_notification.dto.anime;

import com.example.anime_manga_notification.enums.StatusAnime;

import java.time.LocalDateTime;


public record AnimeResponseDto(
        String animeName,
        String category,
        String description,
        StatusAnime status,
        LocalDateTime releaseDate,
        LocalDateTime lastEpisodeReleaseDate,
        LocalDateTime createAt
) {
}
