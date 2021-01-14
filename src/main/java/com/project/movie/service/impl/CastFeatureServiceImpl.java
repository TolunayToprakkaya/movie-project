package com.project.movie.service.impl;

import com.project.movie.base.dto.CastFeature;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.CastFeatureEntity;
import com.project.movie.repository.CastFeatureRepository;
import com.project.movie.service.ICastFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastFeatureServiceImpl implements ICastFeatureService {

    @Autowired
    private CastFeatureRepository castFeatureRepository;

    @Autowired
    private DozerMapperUtility dozerMapperUtility;

    static String mapId = "CastFeatureEntity_CastFeature";

    @Override
    public List<CastFeature> fetchAllCastFeatureList() {
        List<CastFeatureEntity> castFeatureEntityList = castFeatureRepository.findAll();

        return dozerMapperUtility.map(castFeatureEntityList, CastFeature.class, mapId);
    }

    @Override
    public CastFeature inquireCastFeatureById(Long castFeatureId) {
        CastFeatureEntity castFeatureEntity = castFeatureRepository.findByCastFeatureId(castFeatureId);

        return dozerMapperUtility.map(castFeatureEntity, CastFeature.class, mapId);
    }

    @Override
    public CastFeature createNewCastFeature(CastFeature castFeature) {
        CastFeatureEntity castFeatureEntity = dozerMapperUtility.map(castFeature, CastFeatureEntity.class, mapId);
        castFeatureRepository.save(castFeatureEntity);

        return dozerMapperUtility.map(castFeatureEntity, CastFeature.class, mapId);
    }

    @Override
    public CastFeature updateCastFeature(CastFeature castFeature, Long castFeatureId) {
        CastFeatureEntity castFeatureEntity = castFeatureRepository.findByCastFeatureId(castFeatureId);
        castFeatureEntity.setIsActor(castFeature.getIsActor());
        castFeatureEntity.setIsActress(castFeature.getIsActress());
        castFeatureRepository.save(castFeatureEntity);

        return dozerMapperUtility.map(castFeatureEntity, CastFeature.class, mapId);
    }

    @Override
    public CastFeature deleteCastFeatureById(Long castFeatureId) {
        CastFeatureEntity castFeatureEntity = castFeatureRepository.findByCastFeatureId(castFeatureId);
        castFeatureRepository.deleteById(castFeatureId);

        return dozerMapperUtility.map(castFeatureEntity, CastFeature.class, mapId);
    }
}
