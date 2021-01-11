package com.project.movie.service.impl;

import com.project.movie.base.dto.Actress;
import com.project.movie.base.mapper.DozerMapperUtility;
import com.project.movie.entity.ActressEntity;
import com.project.movie.repository.ActressRepository;
import com.project.movie.service.IActressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActressServiceImpl implements IActressService {

    @Autowired
    private ActressRepository actressRepository;

    @Autowired
    private DozerMapperUtility dozerMapperUtility;

    static String mapId = "ActressEntity_Actress";

    @Override
    public List<Actress> fetchAllActressList() {
        List<ActressEntity> actressEntityList = actressRepository.findAll();

        return dozerMapperUtility.map(actressEntityList, Actress.class, mapId);
    }

    @Override
    public Actress inquireActressById(Long actressId) {
        ActressEntity actressEntity = actressRepository.findByActressId(actressId);

        return dozerMapperUtility.map(actressEntity, Actress.class, mapId);
    }

    @Override
    public Actress createNewActress(Actress actress) {
        ActressEntity actressEntity = dozerMapperUtility.map(actress, ActressEntity.class, mapId);
        actressRepository.save(actressEntity);

        return dozerMapperUtility.map(actressEntity, Actress.class, mapId);
    }

    @Override
    public Actress updateActress(Actress actress, Long actressId) {
        ActressEntity actressEntity = actressRepository.findByActressId(actressId);
        actressEntity.setName(actress.getName());
        actressEntity.setLastname(actress.getLastname());
        actressEntity.setBirthday(actress.getBirthday());
        actressEntity.setBirthday(actress.getBirthday());
        actressEntity.setMovieEntity(actress.getMovieEntity());
        actressRepository.save(actressEntity);

        return dozerMapperUtility.map(actressEntity, Actress.class, mapId);
    }

    @Override
    public Actress deleteActressById(Long actressId) {
        ActressEntity actressEntity = actressRepository.findByActressId(actressId);
        actressRepository.deleteById(actressId);

        return dozerMapperUtility.map(actressEntity, Actress.class, mapId);
    }
}
