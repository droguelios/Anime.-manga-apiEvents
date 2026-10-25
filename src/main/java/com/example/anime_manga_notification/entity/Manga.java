package com.example.anime_manga_notification.entity;

import com.example.anime_manga_notification.enums.StatusAnime;
import com.example.anime_manga_notification.enums.StatusManga;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.Set;

import java.time.LocalDateTime;

@Entity
@Table( name = "manga" )
@NoArgsConstructor
@Getter
@Setter
public class Manga {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    @Column(name = "mangaName" , nullable = false)
    private String mangaName;

    @Column(name = "author" , nullable = false)
    private String author;

    @Column(name = "description" , columnDefinition = "TEXT" , nullable = false)
    private String description;

    @Column(name = "chapters")
    private Integer chapters;

    @Enumerated(EnumType.STRING)
    @Column(name = "status" , nullable = false)
    private StatusManga status;

    @Column(name = "created_at" , nullable = false , updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updateAT" , nullable = false, updatable = false)
    private LocalDateTime updatedAt;



}
