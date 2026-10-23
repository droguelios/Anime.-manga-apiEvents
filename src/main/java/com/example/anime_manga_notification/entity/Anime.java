package com.example.anime_manga_notification.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table( name = "anime" )
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Anime {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column( name = "animeName" , nullable = false )

    private String animeName;

    @Column(name = "category" , nullable = false)
    private String category;

    @Column(name = "description",columnDefinition = "TEXT" , nullable = false)
    private String description;

    @Column(name = "status")

    private String status = "AIRING";
    @Column(name = "release_date")
    private LocalDateTime releaseDate;
    @Column(name = "last_episode_release_date")
    private LocalDateTime lastEpisodeReleaseDate;
    @Column(name = "created_at" , nullable = false )
    private LocalDateTime createdAt;

    @Column(name = "updatedAt" , nullable = false , updatable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    public void PrePersist(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void PreUpdate(){
        this.updatedAt = LocalDateTime.now();
    }


}
