package com.project.movie.service.impl;

import com.project.movie.base.dto.Cast;
import com.project.movie.base.dto.CastFeature;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.CastEntity;
import com.project.movie.entity.CastFeatureEntity;
import com.project.movie.repository.CastFeatureRepository;
import com.project.movie.repository.CastRepository;
import com.project.movie.service.ICastFeatureService;
import com.project.movie.service.ICastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastServiceImpl implements ICastService {

    @Autowired
    private CastRepository castRepository;

    @Autowired
    private ICastFeatureService castFeatureService;

    @Autowired
    private CastFeatureRepository castFeatureRepository;

    @Autowired
    private DozerMapperUtility dozerMapperUtility;

    static String mapId = "CastEntity_Cast";

    @Override
    public List<Cast> fetchAllCastList() {
        List<CastEntity> castEntityList = castRepository.findAll();

        return dozerMapperUtility.map(castEntityList, Cast.class, mapId);
    }

    @Override
    public Cast inquireCastById(Long castId) {
        CastEntity castEntity = castRepository.findByCastId(castId);

        return dozerMapperUtility.map(castEntity, Cast.class, mapId);
    }

    @Override
    @Transient
    public Cast createNewCast(Cast cast) {
        CastEntity castEntity = dozerMapperUtility.map(cast, CastEntity.class, mapId);
        castRepository.save(castEntity);

        CastFeature castFeature = castFeatureService.inquireCastFeatureById(castEntity.getCastFeatureEntity().getCastFeatureId());
        CastFeatureEntity castFeatureEntity = dozerMapperUtility.map(castFeature, CastFeatureEntity.class, "CastFeatureEntity_CastFeature");
        castFeatureEntity.setCastId(castEntity.getCastId());
        castFeatureRepository.save(castFeatureEntity);

        return dozerMapperUtility.map(castEntity, Cast.class, mapId);
    }

    @Override
    public Cast updateCast(Cast cast, Long castId) {
        CastEntity castEntity = castRepository.findByCastId(castId);
        castEntity.setName(cast.getName());
        castEntity.setLastname(cast.getLastname());
        castEntity.setBirthday(cast.getBirthday());
        castEntity.setBirthday(cast.getBirthday());
        castRepository.save(castEntity);

        return dozerMapperUtility.map(castEntity, Cast.class, mapId);
    }

    @Override
    public Cast deleteCastById(Long castId) {
        CastEntity castEntity = castRepository.findByCastId(castId);
        castRepository.deleteById(castId);

        return dozerMapperUtility.map(castEntity, Cast.class, mapId);
    }

    @Override
    public List<Cast> fetchAllCastList(List<Long> castIds) {
        List<CastEntity> castEntityList = castRepository.findByCastIds(castIds);

        return dozerMapperUtility.map(castEntityList, Cast.class, mapId);
    }
}
