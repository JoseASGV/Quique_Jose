package com.qimu.proyectointegrador.domain.ports;

import com.qimu.proyectointegrador.domain.entities.Game;

import java.util.List;

public interface GameDao {
    void saveGame(Game game, String genreId);

    void deleteGame(String gameId);

    public List<Game> listAllGames();
}
