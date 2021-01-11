package com.project.movie.base.dto;

import com.project.movie.entity.MovieEntity;

import java.util.Date;

public class Actress {

    private Long actressId;
    private String name;
    private String lastname;
    private Date birthday;
    private String birthplace;
    private MovieEntity movieEntity;

    public Long getActressId() {
        return actressId;
    }

    public void setActressId(Long actressId) {
        this.actressId = actressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public MovieEntity getMovieEntity() {
        return movieEntity;
    }

    public void setMovieEntity(MovieEntity movieEntity) {
        this.movieEntity = movieEntity;
    }
}
