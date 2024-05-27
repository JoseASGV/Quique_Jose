package com.qimu.proyectointegrador.data.datasources;

import com.qimu.proyectointegrador.data.dtos.GenreJPAEntity;
import com.qimu.proyectointegrador.domain.entities.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreJPADataSource extends CrudRepository<GenreJPAEntity, String> {
}
