package com.nucasim.admin.repository.impl;

import java.util.List;

import com.nucasim.admin.enumeration.TipoIdentif;
import com.nucasim.admin.model.Estudiantes;
import com.nucasim.admin.repository.EstudiantesRepository;
import com.nucasim.admin.repository.dao.IEstudiantesDAO;

public class EstudiantesDAO implements IEstudiantesDAO{
	
	private final EstudiantesRepository repository;
	
	public EstudiantesDAO(EstudiantesRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<Estudiantes> findByTipoIdentif(TipoIdentif tipoIdentificacion) {
		return repository.findByTipoIdentificacion(tipoIdentificacion);
	}

	@Override
	public Estudiantes findByIdentificacionAndTipoIdentif(int identificacion,TipoIdentif tipoIdentificacion) {
		return repository.findByIdentificacionAndTipoIdentificacion(identificacion, tipoIdentificacion);
	}
	
	@Override
	public Estudiantes saveEstudiantes(Estudiantes estudiante) {
		return repository.save(estudiante);
	}

	@Override
	public Estudiantes updateEstudiantes(Estudiantes estudiante) {
		return repository.save(estudiante);
	}

}
