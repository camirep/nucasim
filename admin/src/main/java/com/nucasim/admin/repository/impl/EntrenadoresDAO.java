package com.nucasim.admin.repository.impl;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Entrenadores;
import com.nucasim.admin.repository.EntrenadoresRepository;
import com.nucasim.admin.repository.dao.IEntrenadoresDAO;

public class EntrenadoresDAO implements IEntrenadoresDAO{
	
	private final EntrenadoresRepository repository;

	public EntrenadoresDAO(EntrenadoresRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<Entrenadores> findByDeshabilitar(Estado deshabilitar) {
		return repository.findByDeshabilitar(deshabilitar);
	}

	@Override
	public Entrenadores findByIdentificacionAndDeshabilitar(int identificacion,Estado deshabilitar) {
		return repository.findByIdentificacionAndDeshabilitar(identificacion, deshabilitar);
	}
	
	@Override
	public Entrenadores saveEntrenadores(Entrenadores entrenador) {
		return repository.save(entrenador);
	}

	@Override
	public Entrenadores updateEntrenadores(Entrenadores entrenador) {
		return repository.save(entrenador);
	}

}
