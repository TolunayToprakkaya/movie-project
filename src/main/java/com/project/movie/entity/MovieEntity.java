package com.project.movie.entity;

import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movie")
public class MovieEntity extends AbstractEditableEntity {

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
