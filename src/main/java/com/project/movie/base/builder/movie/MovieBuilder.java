package com.project.movie.base.builder.movie;

import com.project.movie.entity.MovieEntity;

public class MovieBuilder {

    private String name;
    private String title;
    private String cover;

    public MovieBuilder name(String name) {
        this.name = name;
        return this;
    }

    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder cover(String cover) {
        this.cover = cover;
        return this;
    }

    public MovieEntity build() {
        return new MovieEntity(name, title, cover);
    }
}
