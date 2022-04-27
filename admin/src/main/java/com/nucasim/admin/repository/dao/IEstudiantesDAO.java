package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.TipoIdentif;
import com.nucasim.admin.model.Estudiantes;

public interface IEstudiantesDAO {
	
	List<Estudiantes> findByTipoIdentif(TipoIdentif tipoIdentificacion);
	
	List<Estudiantes> findAll();
	
	Estudiantes findByIdentificacionAndTipoIdentif(int identificacion, TipoIdentif tipoIdentificacion);
	
	Estudiantes saveEstudiantes(Estudiantes estudiante);
	
	Estudiantes updateEstudiantes(Estudiantes estudiante);

}
