package com.project.movie.repository;

import com.project.movie.entity.CastFeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CastFeatureRepository extends JpaRepository<CastFeatureEntity, Long> {

    CastFeatureEntity findByCastFeatureId(Long castFeatureId);
}
