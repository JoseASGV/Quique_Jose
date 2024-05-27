package com.qimu.proyectointegrador.data.dtos;

import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.entities.Genre;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="genre")
@Table(name="GENRES")
public class GenreJPAEntity {
    @Id
    private String id;
    @Column (nullable = false)
    private String name;
    @OneToMany(mappedBy = "genre")
    private List<GameJPAEntity> games;


    public GenreJPAEntity(String id, String name, List<GameJPAEntity> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public GenreJPAEntity() {
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

    public List<GameJPAEntity> getGames() {
        return games;
    }

    public void setGames(List<GameJPAEntity> games) {
        this.games = games;
    }

    public Genre mapToDomain(){
        Genre genre = new Genre(this.getId(), this.getName());

        List<Game> genreGames = new ArrayList<>();
        for (var genreGame : this.getGames()) {
            Game game = new Game(genreGame.getId(), genreGame.getTitle(), genreGame.getStudio());
            game.setGenre(genre);
            genreGames.add(game);
        }
        genre.setGames(genreGames);
        return genre;
    }
}
