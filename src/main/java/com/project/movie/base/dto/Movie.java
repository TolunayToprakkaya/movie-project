package com.project.movie.base.dto;

import com.project.movie.entity.ActorEntity;

import java.util.Set;

public class Movie {

    private Long movieId;
    private String name;
    private String title;
    private String cover;
    private Set<ActorEntity> actorEntity;

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

    public Set<ActorEntity> getActorEntity() {
        return actorEntity;
    }

    public void setActorEntity(Set<ActorEntity> actorEntity) {
        this.actorEntity = actorEntity;
    }
}
