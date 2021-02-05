package com.project.movie.repository;

import com.project.movie.entity.MovieCastsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCastsRepository extends JpaRepository<MovieCastsEntity, Long> {

    List<MovieCastsEntity> findByMovieId(Long movieId);
}
