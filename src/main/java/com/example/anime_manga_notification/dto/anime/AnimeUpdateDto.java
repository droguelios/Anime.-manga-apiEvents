package com.example.anime_manga_notification.dto.anime;

import jakarta.validation.constraints.NotBlank;

public record AnimeUpdateDto(
        String animeName,
        String category ,
        String description,
        String studio,
        String status
) {
}
