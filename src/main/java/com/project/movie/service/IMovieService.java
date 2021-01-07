package com.project.movie.service;

import com.project.movie.base.dto.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> fetchAllMovieList();

    Movie inquireMovieById(Long movieId);

    Movie createNewMovie(Movie movie);

    Movie updateMovie(Movie movie, Long movieId);

    Movie deleteMovieById(Long movieId);
}
