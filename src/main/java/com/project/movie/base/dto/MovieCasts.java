package com.project.movie.base.dto;

public class MovieCasts {

    private Long movieCastId;
    private Long movieId;
    private Long castId;

    public Long getMovieCastId() {
        return movieCastId;
    }

    public void setMovieCastId(Long movieCastId) {
        this.movieCastId = movieCastId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCastId() {
        return castId;
    }

    public void setCastId(Long castId) {
        this.castId = castId;
    }
}
