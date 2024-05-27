package com.qimu.proyectointegrador.domain.entities;

import java.util.List;

public class Genre {
    private String id;
    private String name;
    private List<Game> games;

    public Genre(String id, String name, List<Game> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public Genre(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
