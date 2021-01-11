package com.project.movie.service.impl;

import com.project.movie.base.dto.Actor;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.ActorEntity;
import com.project.movie.repository.ActorRepository;
import com.project.movie.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements IActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private DozerMapperUtility dozerMapperUtility;

    static String mapId = "ActorEntity_Actor";

    @Override
    public List<Actor> fetchAllActorList() {
        List<ActorEntity> actorEntityList = actorRepository.findAll();

        return dozerMapperUtility.map(actorEntityList, Actor.class, mapId);
    }

    @Override
    public Actor inquireActorById(Long actorId) {
        ActorEntity actorEntity = actorRepository.findByActorId(actorId);

        return dozerMapperUtility.map(actorEntity, Actor.class, mapId);
    }

    @Override
    public Actor createNewActor(Actor actor) {
        ActorEntity actorEntity = dozerMapperUtility.map(actor, ActorEntity.class, mapId);
        actorRepository.save(actorEntity);

        return dozerMapperUtility.map(actorEntity, Actor.class, mapId);
    }

    @Override
    public Actor updateActor(Actor actor, Long actorId) {
        ActorEntity actorEntity = actorRepository.findByActorId(actorId);
        actorEntity.setName(actor.getName());
        actorEntity.setLastname(actor.getLastname());
        actorEntity.setBirthday(actor.getBirthday());
        actorEntity.setBirthday(actor.getBirthday());
        actorEntity.setMovieEntity(actor.getMovieEntity());
        actorRepository.save(actorEntity);

        return dozerMapperUtility.map(actorEntity, Actor.class, mapId);
    }

    @Override
    public Actor deleteActorById(Long actorId) {
        ActorEntity actorEntity = actorRepository.findByActorId(actorId);
        actorRepository.deleteById(actorId);

        return dozerMapperUtility.map(actorEntity, Actor.class, mapId);
    }
}
