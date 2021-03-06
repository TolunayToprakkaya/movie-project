package com.project.movie.entity;

import com.project.movie.base.builder.movie.MovieBuilder;
import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class MovieEntity extends AbstractEditableEntity {

    protected MovieEntity(){}

    public MovieEntity(String name, String title, String cover) {
        this.name = name;
        this.title = title;
        this.cover = cover;
    }

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "cover")
    private String cover;

    public static MovieBuilder builder() {
        return new MovieBuilder();
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
