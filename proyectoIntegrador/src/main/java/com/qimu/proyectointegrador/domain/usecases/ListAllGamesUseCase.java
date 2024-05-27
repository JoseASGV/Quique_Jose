package com.qimu.proyectointegrador.domain.usecases;

import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.entities.Genre;
import com.qimu.proyectointegrador.domain.entities.Studio;
import com.qimu.proyectointegrador.domain.ports.GameDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ListAllGamesUseCase {

    private GameDao dao;

    public ListAllGamesUseCase(GameDao dao) {
        this.dao = dao;
    }

    public List<Game> execute() {
        return dao.listAllGames();
    }
}
