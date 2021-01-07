package com.project.movie.service.impl;

import com.project.movie.base.dto.Movie;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.MovieEntity;
import com.project.movie.repository.MovieRepository;
import com.project.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private DozerMapperUtility dozerMapperUtility;

    static String mapId = "MovieEntity_Movie";

    @Override
    public List<Movie> fetchAllMovieList() {
        List<MovieEntity> movieEntityList = movieRepository.findAll();

        return dozerMapperUtility.map(movieEntityList, Movie.class, mapId);
    }

    @Override
    public Movie inquireMovieById(Long movieId) {
        MovieEntity movieEntity = movieRepository.findByMovieId(movieId);

        return dozerMapperUtility.map(movieEntity, Movie.class, mapId);
    }

    @Override
    public Movie createNewMovie(Movie movie) {
        MovieEntity movieEntity = dozerMapperUtility.map(movie, MovieEntity.class, mapId);
        movieRepository.save(movieEntity);

        return dozerMapperUtility.map(movieEntity, Movie.class, mapId);
    }

    @Override
    public Movie updateMovie(Movie movie, Long movieId) {
        MovieEntity movieEntity = movieRepository.findByMovieId(movieId);
        movieEntity.setName(movie.getName());
        movieEntity.setTitle(movie.getTitle());
        movieEntity.setCover(movie.getCover());
        movieRepository.save(movieEntity);

        return dozerMapperUtility.map(movieEntity, Movie.class, mapId);
    }

    @Override
    public Movie deleteMovieById(Long movieId) {
        MovieEntity movieEntity = movieRepository.findByMovieId(movieId);
        movieRepository.deleteById(movieId);

        return dozerMapperUtility.map(movieEntity, Movie.class, mapId);
    }
}
