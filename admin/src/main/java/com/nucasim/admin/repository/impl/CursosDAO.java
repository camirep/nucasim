package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Cursos;
import com.nucasim.admin.repository.CursosRepository;
import com.nucasim.admin.repository.dao.ICursosDAO;

@Repository
public class CursosDAO implements ICursosDAO{
	
	private final CursosRepository repository;

	public CursosDAO(CursosRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Cursos> findByDeshabilitar(Estado deshabilitar) {
		return repository.findByDeshabilitar(deshabilitar);
	}

	@Override
	public Cursos findByCodigoAndDeshabilitar(String codigo,Estado deshabilitar) {
		return repository.findByCodigoAndDeshabilitar(codigo, deshabilitar);
	}
	
	@Override
	public Cursos saveCurso(Cursos curso) {
		return repository.save(curso);
	}

	@Override
	public Cursos updateCurso(Cursos curso) {
		return repository.save(curso);
	}
	
}
