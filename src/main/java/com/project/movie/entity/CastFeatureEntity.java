package com.project.movie.entity;

import com.project.movie.base.type.AbstractEditableEntity;

import javax.persistence.*;

@Entity
@Table(name = "cast_feature")
public class CastFeatureEntity extends AbstractEditableEntity {

    @Id
    @Column(name = "cast_feature_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long castFeatureId;

    @Basic
    @Column(name = "cast_id")
    private Long castId;

    @Basic
    @Column(name = "is_actor")
    private Long isActor;

    @Basic
    @Column(name = "is_actress")
    private Long isActress;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "castFeatureEntity")
    private CastEntity castEntity;

    public Long getCastFeatureId() {
        return castFeatureId;
    }

    public void setCastFeatureId(Long castFeatureId) {
        this.castFeatureId = castFeatureId;
    }

    public Long getCastId() {
        return castId;
    }

    public void setCastId(Long castId) {
        this.castId = castId;
    }

    public Long getIsActor() {
        return isActor;
    }

    public void setIsActor(Long isActor) {
        this.isActor = isActor;
    }

    public Long getIsActress() {
        return isActress;
    }

    public void setIsActress(Long isActress) {
        this.isActress = isActress;
    }

    public CastEntity getCastEntity() {
        return castEntity;
    }

    public void setCastEntity(CastEntity castEntity) {
        this.castEntity = castEntity;
    }
}
