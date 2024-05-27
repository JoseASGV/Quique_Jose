package com.qimu.proyectointegrador.domain.entities;

import java.util.UUID;


public class Game {
    private String id;
    private String title;
    private Genre genre;
    private String studio;

    public Game(String id, String title, Genre genre, String studio) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.studio = studio;
    }

    public Game(String title, String studio) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.studio = studio;
    }

    public Game(String id, String title, String studio) {
        this.id = id;
        this.title = title;
        this.studio = studio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}


