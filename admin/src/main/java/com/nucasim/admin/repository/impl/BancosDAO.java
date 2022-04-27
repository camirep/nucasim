package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Bancos;
import com.nucasim.admin.repository.BancosRepository;
import com.nucasim.admin.repository.dao.IBancosDAO;

@Repository
public class BancosDAO implements IBancosDAO{
	
	private final BancosRepository repository;
		
	public BancosDAO(BancosRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<Bancos> findByDeshabilitar(Estado deshabilitar) {
		return repository.findByDeshabilitar(deshabilitar);
	}

	@Override
	public Bancos findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar) {
		return repository.findByCodigoAndDeshabilitar(codigo, deshabilitar);
	}

}
