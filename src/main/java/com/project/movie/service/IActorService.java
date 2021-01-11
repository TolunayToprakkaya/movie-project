package com.project.movie.service;

import com.project.movie.base.dto.Actor;

import java.util.List;

public interface IActorService {

    List<Actor> fetchAllActorList();

    Actor inquireActorById(Long actorId);

    Actor createNewActor(Actor actor);

    Actor updateActor(Actor actor, Long actorId);

    Actor deleteActorById(Long actorId);
}
