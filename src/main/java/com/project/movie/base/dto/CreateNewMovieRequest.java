package com.project.movie.base.dto;

import java.util.List;

public class CreateNewMovieRequest {

    private String name;
    private String title;
    private String cover;
    private List<Long> castIdList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<Long> getCastIdList() {
        return castIdList;
    }

    public void setCastIdList(List<Long> castIdList) {
        this.castIdList = castIdList;
    }
}
