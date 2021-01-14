package com.project.movie.repository;

import com.project.movie.entity.CastEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CastRepository extends JpaRepository<CastEntity, Long> {

    CastEntity findByCastId(Long castId);

    @Query("Select cast from CastEntity cast where cast.castId in (:castIds)")
    List<CastEntity> findByCastIds(List<Long> castIds);
}
