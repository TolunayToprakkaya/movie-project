package com.project.movie.entity;

import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "actress")
public class ActressEntity extends AbstractEditableEntity {

    @Id
    @Column(name = "actress_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actressId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "lastname")
    private String lastname;

    @Basic
    @Column(name = "birthday")
    private Date birthday;

    @Basic
    @Column(name = "birthplace")
    private String birthplace;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
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
