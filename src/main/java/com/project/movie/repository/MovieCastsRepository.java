package com.project.movie.repository;

import com.project.movie.entity.MovieCastsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCastsRepository extends JpaRepository<MovieCastsEntity, Long> {
}
