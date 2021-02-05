package com.project.movie.base.builder.castFeature;

import com.project.movie.entity.CastFeatureEntity;

public class CastFeatureBuilder {

    private Long castId;
    private Long isActor;
    private Long isActress;

    public CastFeatureBuilder castId(Long castId) {
        this.castId = castId;
        return this;
    }

    public CastFeatureBuilder isActor(Long isActor) {
        this.isActor = isActor;
        return this;
    }

    public CastFeatureBuilder isActress(Long isActress) {
        this.isActress = isActress;
        return this;
    }

    public CastFeatureEntity build() {
        return new CastFeatureEntity(castId, isActor, isActress);
    }
}
