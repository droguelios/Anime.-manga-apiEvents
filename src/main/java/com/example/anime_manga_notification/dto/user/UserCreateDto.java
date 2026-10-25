package com.example.anime_manga_notification.dto.user;

import com.example.anime_manga_notification.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserCreateDto(
        @NotBlank(message = "the User name is required" )
        @Size(min = 3, max = 20, message = "the User name must be between 3 and 20 characters")
        String UserName,
        @NotBlank(message = "the Email is required")
        @Size(min = 5, max = 100, message = "the Email must be between 5 and 50 characters")
        String Email,
        @NotBlank(message = "the Password is required")
        @Size(min = 8, max = 100, message = "the Password must be between 8 and 100 characters")
        String Password,
        @NotNull(message = "the Role is required")
        Role role
) {
}
