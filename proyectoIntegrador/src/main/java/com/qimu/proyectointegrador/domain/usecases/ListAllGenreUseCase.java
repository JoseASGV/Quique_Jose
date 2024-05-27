package com.qimu.proyectointegrador.domain.usecases;

import com.qimu.proyectointegrador.domain.entities.Genre;
import com.qimu.proyectointegrador.domain.ports.GenreDao;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ListAllGenreUseCase {

    private GenreDao genreDao;

    public ListAllGenreUseCase(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    public List<Genre> execute(){
        return this.genreDao.listAllGenres();
    }
}
