package com.project.movie.service.impl;

import com.project.movie.base.dto.Cast;
import com.project.movie.base.dto.CreateNewMovieRequest;
import com.project.movie.base.dto.Movie;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.CastEntity;
import com.project.movie.entity.MovieCastsEntity;
import com.project.movie.entity.MovieEntity;
import com.project.movie.repository.MovieCastsRepository;
import com.project.movie.repository.MovieRepository;
import com.project.movie.service.ICastService;
import com.project.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieCastsRepository movieCastsRepository;

    @Autowired
    private ICastService castService;

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
    @Transient
    public Movie createNewMovie(CreateNewMovieRequest request) {
        Movie movie = new Movie();
        movie.setName(request.getName());
        movie.setTitle(request.getTitle());
        movie.setCover(request.getCover());
        List<Cast> castList = castService.fetchAllCastList(request.getCastIdList());
        movie.setCastList(castList);

        MovieEntity movieEntity = dozerMapperUtility.map(movie, MovieEntity.class, mapId);
        movieRepository.save(movieEntity);

        List<Long> castIdList = castList.stream().map(Cast::getCastId).collect(Collectors.toList());
        for (Long castId : castIdList) {
            MovieCastsEntity movieCastsEntity = new MovieCastsEntity();
            movieCastsEntity.setMovieId(movieEntity.getMovieId());
            movieCastsEntity.setCastId(castId);
            movieCastsRepository.save(movieCastsEntity);
        }

        return movie;
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
