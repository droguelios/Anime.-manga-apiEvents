package com.example.anime_manga_notification.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table( name = "manga" )
@NoArgsConstructor
@Getter
@Setter
public class Manga {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;

    @Column(name = "MangaName" , nullable = false)
    private String MangaName;

    @Column(name = "author" , nullable = false)
    private String author;

    @Column(name = "description" , columnDefinition = "TEXT" , nullable = false)
    private String description;

    @Column(name = "chapters")
    private String chapters;

    @Column(name = "status")
    private String status = "ONGOING";

    @Column(name = "created_at" , nullable = false , updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updateAT" , nullable = false, updatable = false)
    private LocalDateTime updatedAt;

}
