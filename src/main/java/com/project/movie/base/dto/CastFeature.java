package com.project.movie.base.dto;

public class CastFeature {

    private Long castFeatureId;
    private Long castId;
    private Long isActor;
    private Long isActress;

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
}
