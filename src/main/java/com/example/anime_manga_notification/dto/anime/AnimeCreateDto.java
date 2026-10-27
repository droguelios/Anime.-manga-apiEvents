package com.example.anime_manga_notification.dto.anime;

import com.example.anime_manga_notification.enums.Role;
import com.example.anime_manga_notification.enums.StatusAnime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

public record AnimeCreateDto(
        @NotBlank(message = "Anime name is required")
        String animeName,
        @NotBlank(message = "Category is required")
        String category,
        @NotBlank(message = "Description is required")
        String description,
        @NotBlank(message = "Status is required")
        StatusAnime status,
        @NotBlank(message = "Studio is required")
        String studio,
        @NotNull(message = "Release date is required")
        LocalDateTime releaseDate,
        @NotNull(message = "Last episode release date is required")
        LocalDateTime lastEpisodeReleaseDate
) {
}
