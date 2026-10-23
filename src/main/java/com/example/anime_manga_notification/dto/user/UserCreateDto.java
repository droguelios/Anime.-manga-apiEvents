package com.example.anime_manga_notification.dto.user;

import com.example.anime_manga_notification.enums.Role;

public record UserCreateDto(

        String UserName,
        String Email,
        String Password,
        Role role
) {
}
