package com.project.movie.entity;

import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;

@Entity
@Table(name = "movie_casts")
public class MovieCastsEntity extends AbstractEditableEntity {

    @Id
    @Column(name = "movie_casts_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieCastId;

    @Basic
    @Column(name = "movie_id")
    private Long movieId;

    @Basic
    @Column(name = "cast_id")
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
