package com.project.movie.base.builder.cast;

import com.project.movie.entity.CastEntity;
import com.project.movie.entity.CastFeatureEntity;

import java.util.Date;

public class CastBuilder {

    private String name;
    private String lastname;
    private String photo;
    private Date birthday;
    private String birthplace;
    private String biography;
    private CastFeatureEntity castFeatureEntity;

    public CastBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CastBuilder lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public CastBuilder photo(String photo) {
        this.photo = photo;
        return this;
    }

    public CastBuilder birthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public CastBuilder birthplace(String birthplace) {
        this.birthplace = birthplace;
        return this;
    }

    public CastBuilder biography(String biography) {
        this.biography = biography;
        return this;
    }

    public CastBuilder castFeatureEntity(CastFeatureEntity castFeatureEntity) {
        this.castFeatureEntity = castFeatureEntity;
        return this;
    }

    public CastEntity build() {
        return new CastEntity(name, lastname, photo, birthday, birthplace, biography, castFeatureEntity);
    }
}
