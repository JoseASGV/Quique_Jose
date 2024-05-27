package com.qimu.proyectointegrador.domain.usecases;

import com.qimu.proyectointegrador.domain.ports.GameDao;
import org.springframework.stereotype.Component;

@Component
public class DeleteGameUseCase {
    private GameDao dao;

    public DeleteGameUseCase(GameDao dao) {
        this.dao = dao;
    }

    public void execute(String gameId){
        this.dao.deleteGame(gameId);
    }
}
