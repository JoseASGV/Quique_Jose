package com.qimu.proyectointegrador.data.daos;

import com.qimu.proyectointegrador.data.datasources.GameJPADataSource;
import com.qimu.proyectointegrador.data.datasources.GenreJPADataSource;
import com.qimu.proyectointegrador.data.dtos.GameJPAEntity;
import com.qimu.proyectointegrador.data.dtos.GenreJPAEntity;
import com.qimu.proyectointegrador.domain.ports.GameDao;
import com.qimu.proyectointegrador.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class GameDBDao implements GameDao {

    private GameJPADataSource gameDateSource;
    private GenreJPADataSource genreDataSource;

    public GameDBDao(GameJPADataSource gameDateSource, GenreJPADataSource genreDataSource) {
        this.gameDateSource = gameDateSource;
        this.genreDataSource = genreDataSource;
    }

    @Override
    public void saveGame(Game game, String genreId) {
        var gameGenre = this.genreDataSource.findById(genreId).orElseThrow();
        var gameJPAEntity = new GameJPAEntity();
        gameJPAEntity.setId(game.getId());
        gameJPAEntity.setTitle(game.getTitle());
        gameJPAEntity.setStudio(game.getStudio());
        gameJPAEntity.setGenre(gameGenre);

        this.gameDateSource.save(gameJPAEntity);
    }

    @Override
    public List<Game> listAllGames() {

        List <Game> result = new ArrayList<>();

        for (var gameEntity: this.gameDateSource.findAll()){
            result.add(new Game(gameEntity.getId(), gameEntity.getTitle(),gameEntity.getGenre().mapToDomain(),gameEntity.getStudio()));
        }
        return result;
    }

    @Override
    public void deleteGame(String gameId) {
        this.gameDateSource.deleteById(gameId);
    }
}
