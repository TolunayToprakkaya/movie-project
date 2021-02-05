package com.project.movie.entity;

import com.project.movie.base.builder.cast.CastBuilder;
import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "[cast]")
public class CastEntity extends AbstractEditableEntity {

    public CastEntity() {}

    public CastEntity(String name, String lastname, String photo, Date birthday, String birthplace, String biography, CastFeatureEntity castFeatureEntity) {
        this.name = name;
        this.lastname = lastname;
        this.photo = photo;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.biography = biography;
        this.castFeatureEntity = castFeatureEntity;
    }

    @Id
    @Column(name = "cast_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long castId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "lastname")
    private String lastname;

    @Basic
    @Column(name = "photo")
    private String photo;

    @Basic
    @Column(name = "birthday")
    private Date birthday;

    @Basic
    @Column(name = "birthplace")
    private String birthplace;

    @Basic
    @Column(name = "biography", length=2048)
    private String biography;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
    @JoinColumn(name = "cast_feature_id", nullable = false)
    private CastFeatureEntity castFeatureEntity;

    public static CastBuilder builder() {
        return new CastBuilder();
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public CastFeatureEntity getCastFeatureEntity() {
        return castFeatureEntity;
    }

    public void setCastFeatureEntity(CastFeatureEntity castFeatureEntity) {
        this.castFeatureEntity = castFeatureEntity;
    }
}
