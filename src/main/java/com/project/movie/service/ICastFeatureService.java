package com.project.movie.service;

import com.project.movie.base.dto.CastFeature;

import java.util.List;

public interface ICastFeatureService {

    List<CastFeature> fetchAllCastFeatureList();

    CastFeature inquireCastFeatureById(Long castFeatureId);

    CastFeature createNewCastFeature(CastFeature castFeature);

    CastFeature updateCastFeature(CastFeature castFeature, Long castFeatureId);

    CastFeature deleteCastFeatureById(Long castFeatureId);
}
