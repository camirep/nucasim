package com.nucasim.admin.repository.impl;

import java.util.List;

import com.nucasim.admin.enumeration.EstadoEstudianteGrupo;
import com.nucasim.admin.model.EstudiantesGrupo;
import com.nucasim.admin.repository.EstudiantesGrupoRepository;
import com.nucasim.admin.repository.dao.IEstudiantesGrupoDAO;

public class EstudiantesGrupoDAO implements IEstudiantesGrupoDAO{

private final EstudiantesGrupoRepository repository;
	
	public EstudiantesGrupoDAO(EstudiantesGrupoRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<EstudiantesGrupo> findByEstadoEstudianteGrupo(EstadoEstudianteGrupo estadoEstudiante) {
		return repository.findByEstado(estadoEstudiante);
	}

	@Override
	public EstudiantesGrupo findByidEstudianteGrupoAndEstadoEstudianteGrupo(int idEstudianteGrupo, EstadoEstudianteGrupo estadoEstudiante) {
		return repository.findByIdEstudianteGrupoAndEstado(idEstudianteGrupo, estadoEstudiante);
	}
	
	@Override
	public EstudiantesGrupo saveEstudiantesGrupo(EstudiantesGrupo estudianteGrupo) {
		return repository.save(estudianteGrupo);
	}

	@Override
	public EstudiantesGrupo updateEstudiantesGrupo(EstudiantesGrupo estudianteGrupo) {
		return repository.save(estudianteGrupo);
	}
}
