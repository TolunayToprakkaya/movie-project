package com.project.movie.repository;

import com.project.movie.entity.ActressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActressRepository extends JpaRepository<ActressEntity, Long> {

    ActressEntity findByActressId(Long actressId);
}
