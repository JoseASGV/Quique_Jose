package com.qimu.proyectointegrador.data.dtos;

public class NewGameRequest {
    private String title;
    private String studio;
    private String genreId;

    public NewGameRequest(String title, String studio, String genreId) {
        this.title = title;
        this.studio = studio;
        this.genreId = genreId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
