package com.project.movie.repository;

import com.project.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    MovieEntity findByMovieId(Long movieId);
}
