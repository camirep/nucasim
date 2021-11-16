package com.nucasim.admin.repository.impl;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Profesiones;
import com.nucasim.admin.repository.ProfesionesRepository;
import com.nucasim.admin.repository.dao.IProfesionesDAO;

public class ProfesionesDAO implements IProfesionesDAO{
	
	private final ProfesionesRepository repository;

	public ProfesionesDAO(ProfesionesRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<Profesiones> findByDeshabilitar(Estado deshabilitar) {
		return repository.findByDeshabilitar(deshabilitar);
	}

	@Override
	public Profesiones findByCodigoAndDeshabilitar(int codigo,Estado deshabilitar) {
		return repository.findByCodigoAndDeshabilitar(codigo, deshabilitar);
	}
	
	@Override
	public Profesiones saveProfesiones(Profesiones profesion) {
		return repository.save(profesion);
	}

	@Override
	public Profesiones updateProfesiones(Profesiones profesion) {
		return repository.save(profesion);
	}

}
