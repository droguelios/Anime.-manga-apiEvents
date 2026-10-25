package com.example.anime_manga_notification.dto.manga;

import com.example.anime_manga_notification.enums.StatusManga;
import jakarta.validation.constraints.NotBlank;

public record MangaCreateDto(
        @NotBlank(message = "the name is required")
        String mangaName,
        @NotBlank(message = "the author is required")
        String author,
        @NotBlank (message = "the description is required")
        String description,
        @NotBlank(message = "the chapters is required")
        Integer chapters,
        @NotBlank(message = "the status is required")
        StatusManga status
) {
}
