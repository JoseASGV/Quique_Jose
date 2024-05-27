package com.qimu.proyectointegrador.data.datasources;

import com.qimu.proyectointegrador.data.dtos.GameJPAEntity;
import org.springframework.data.repository.CrudRepository;

public interface GameJPADataSource extends CrudRepository<GameJPAEntity, String> {
}
