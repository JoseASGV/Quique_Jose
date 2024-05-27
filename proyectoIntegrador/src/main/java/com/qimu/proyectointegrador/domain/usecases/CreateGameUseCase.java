package com.qimu.proyectointegrador.domain.usecases;

import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.ports.GameDao;
import org.springframework.stereotype.Component;

@Component
public class CreateGameUseCase {

    private GameDao dao;


    public CreateGameUseCase(GameDao dao) {
        this.dao = dao;
    }

    public void execute(String title, String studio, String genreId) {
        Game game = new Game(title, studio);
        dao.saveGame(game, genreId);
    }
}
