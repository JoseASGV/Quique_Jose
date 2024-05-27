package com.qimu.proyectointegrador.data.daos;

import com.qimu.proyectointegrador.data.datasources.GenreJPADataSource;
import com.qimu.proyectointegrador.data.dtos.GenreJPAEntity;
import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.entities.Genre;
import com.qimu.proyectointegrador.domain.ports.GenreDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenreDBDao implements GenreDao {
    private GenreJPADataSource dataSource;

    public GenreDBDao(GenreJPADataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Genre> listAllGenres() {

        List<Genre> result = new ArrayList<>();

        for (var genreJPAEntity : this.dataSource.findAll()) {

            result.add(genreJPAEntity.mapToDomain());
        }

        return result;
    }
}
