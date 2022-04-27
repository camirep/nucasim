package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.enumeration.EstadoGrupoCurso;
import com.nucasim.admin.model.GruposCurso;
import com.nucasim.admin.repository.GruposCursoRepository;
import com.nucasim.admin.repository.dao.IGruposCursoDAO;
@Repository
public class GruposCursoDAO implements IGruposCursoDAO{
	
private final GruposCursoRepository repository;
	
	public GruposCursoDAO(GruposCursoRepository repository) {
	super();
	this.repository = repository;
	}

	@Override
	public List<GruposCurso> findByEstadoGrupoCurso(EstadoGrupoCurso estadoGrupoCurso) {
		return repository.findByEstado(estadoGrupoCurso);
	}

	@Override
	public GruposCurso findByGrupoAndGrupoCurso(int grupo, EstadoGrupoCurso estadoGrupoCurso) {
		return repository.findByGrupoAndEstado(grupo, estadoGrupoCurso);
	}
	
	@Override
	public GruposCurso saveGruposCurso(GruposCurso grupoCurso) {
		return repository.save(grupoCurso);
	}

	@Override
	public GruposCurso updateGruposCurso(GruposCurso grupoCurso) {
		return repository.save(grupoCurso);
	}

}
