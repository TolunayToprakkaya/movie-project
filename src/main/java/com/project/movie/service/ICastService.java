package com.project.movie.service;

import com.project.movie.base.dto.Cast;
import com.project.movie.entity.CastEntity;

import java.util.List;

public interface ICastService {

    List<Cast> fetchAllCastList();

    Cast inquireCastById(Long castId);

    Cast createNewCast(Cast cast);

    Cast updateCast(Cast cast, Long castId);

    Cast deleteCastById(Long castId);

    List<Cast> fetchAllCastList(List<Long> castIds);
}
