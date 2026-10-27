package com.example.anime_manga_notification.repository;

import com.example.anime_manga_notification.entity.Anime;
import com.example.anime_manga_notification.enums.StatusAnime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

    boolean existsByAnimeName(String animeName);

    List<Anime> findByStatus(StatusAnime status);
    Optional<Anime> findById(Long id);
}
