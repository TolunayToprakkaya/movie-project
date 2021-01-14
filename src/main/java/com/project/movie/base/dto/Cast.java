package com.project.movie.base.dto;

import com.project.movie.entity.CastFeatureEntity;

import java.util.Date;

public class Cast {

    private Long castId;
    private String name;
    private String lastname;
    private Date birthday;
    private String birthplace;
    private String biography;
    private CastFeature castFeature;

    public Long getCastId() {
        return castId;
    }

    public void setCastId(Long castId) {
        this.castId = castId;
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

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public CastFeature getCastFeature() {
        return castFeature;
    }

    public void setCastFeature(CastFeature castFeature) {
        this.castFeature = castFeature;
    }
}
