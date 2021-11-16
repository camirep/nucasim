package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.TipoIdentif;
import com.nucasim.admin.model.Estudiantes;

public interface EstudiantesRepository extends CrudRepository<Estudiantes, Integer>{
	
	List<Estudiantes> findByTipoIdentificacion(TipoIdentif tipoIdentificacion);
	
	Estudiantes findByIdentificacionAndTipoIdentificacion(int identificacion, TipoIdentif tipoIdentificacion);
	

}
