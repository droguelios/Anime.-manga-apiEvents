package com.example.anime_manga_notification.dto.user;

import com.example.anime_manga_notification.enums.Role;

public record UserUpdateDto(
        String userName,
        String email,
        String password,
        Role role
) {
}
