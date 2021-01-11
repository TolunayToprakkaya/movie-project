package com.project.movie.repository;

import com.project.movie.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<ActorEntity, Long> {

    ActorEntity findByActorId(Long actorId);
}
