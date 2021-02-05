package com.project.movie.service;

import com.project.movie.base.dto.Cast;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICastService {

    List<Cast> fetchAllCastList();

    Page<Cast> castListPageable(Pageable pageable);

    Cast inquireCastById(Long castId);

    Cast createNewCast(Cast cast);

    Cast updateCast(Cast cast, Long castId);

    Cast deleteCastById(Long castId);

    List<Cast> fetchAllCastList(List<Long> castIds);
}
