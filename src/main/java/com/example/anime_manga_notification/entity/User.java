package com.example.anime_manga_notification.entity;

import com.example.anime_manga_notification.enums.Rol;
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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue ( strategy = GenerationType.SEQUENCE )
    private long id;

    @Column(name = "userName" , nullable = false)
    private String userName;

    @Column(name = "email" , nullable = false)
    private String email;

    @Column(name = "password" ,nullable = false)
    private String password;

    @Column(name = "rol")
    private Rol rol;




}
