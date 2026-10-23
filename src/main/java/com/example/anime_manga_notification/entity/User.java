package com.example.anime_manga_notification.entity;

import com.example.anime_manga_notification.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter 
@Getter 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue ( strategy = GenerationType.SEQUENCE )
    private Long id;

    @Column(name = "userName" , nullable = false)
    private String userName;

    @Column(name = "email" , nullable = false , unique = true)
    private String email;

    @Column(name = "password" ,nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

}
