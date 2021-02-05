package com.project.movie.base.mapper;

import org.dozer.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.ArrayList;
import java.util.List;

public class DozerMapperUtility {

    private Mapper mapper;

    public Mapper getMapper() {
        return mapper;
    }

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public <T> T map(Object sourceObject, Class<T> DestinationClass, String mapId) {
        return mapper.map(sourceObject, DestinationClass, mapId);
    }

    public <T> List<T> map(List sourceList, Class<T> DestinationClass, String mapId) {
        List<T> list = new ArrayList<>();
        for (Object each : sourceList) {
            list.add(mapper.map(each, DestinationClass, mapId));
        }
        return list;
    }

    /*
    public <T> Page<T> mapList(List sourcePage, Class<T> DestinationClass, String mapId) {
        Page<T> page = new PageImpl<T>(sourcePage);
        for (Object each : sourcePage) {

            list.add(mapper.map(each, DestinationClass, mapId));
        }
        return mapper.map(sourcePage, DestinationClass, mapId);
    }
    */
}
