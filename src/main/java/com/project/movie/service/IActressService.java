package com.project.movie.service;


import com.project.movie.base.dto.Actress;

import java.util.List;

public interface IActressService {

    List<Actress> fetchAllActressList();

    Actress inquireActressById(Long actressId);

    Actress createNewActress(Actress actress);

    Actress updateActress(Actress actress, Long actressId);

    Actress deleteActressById(Long actressId);
}
