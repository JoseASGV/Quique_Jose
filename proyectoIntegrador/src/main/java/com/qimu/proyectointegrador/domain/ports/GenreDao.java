package com.qimu.proyectointegrador.domain.ports;

import com.qimu.proyectointegrador.domain.entities.Genre;

import java.util.List;

public interface GenreDao {
    List<Genre> listAllGenres();
}
