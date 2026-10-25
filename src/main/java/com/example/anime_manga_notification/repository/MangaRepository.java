package com.example.anime_manga_notification.repository;

import com.example.anime_manga_notification.entity.Manga;
import com.example.anime_manga_notification.enums.StatusManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MangaRepository extends JpaRepository<Manga , Long> {

    boolean existsByMangaName(String mangaName);

    List<Manga> findByStatus(StatusManga status);
    Optional<Manga> findByMangaName(String mangaName);
}
