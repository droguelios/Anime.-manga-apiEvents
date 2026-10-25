package com.example.anime_manga_notification.dto.manga;

import com.example.anime_manga_notification.enums.StatusManga;

public record MangaResponseDto(
        String mangaName,
        String author,
        String description,
        Integer chapters,
        StatusManga status
) {
}
