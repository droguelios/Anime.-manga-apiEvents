package com.example.anime_manga_notification.dto.user;

import com.example.anime_manga_notification.enums.Role;

public record   UserResponseDto(
        String userName,
        String email,
        Role role
) {
}
