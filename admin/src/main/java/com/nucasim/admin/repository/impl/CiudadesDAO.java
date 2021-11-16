package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Ciudades;
import com.nucasim.admin.repository.CiudadesRepository;
import com.nucasim.admin.repository.dao.ICiudadesDAO;

@Repository
public class CiudadesDAO implements ICiudadesDAO{
	
	private final CiudadesRepository repository;

	public CiudadesDAO(CiudadesRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Ciudades> findByDeshabilitar(Estado deshabilitar) {
		return repository.findByDeshabilitar(deshabilitar);
	}

	@Override
	public Ciudades findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar) {
		return repository.findByCodigoAndDeshabilitar(codigo, deshabilitar);
	}
	
}
