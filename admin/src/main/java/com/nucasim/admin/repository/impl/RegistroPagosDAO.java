package com.nucasim.admin.repository.impl;

import java.util.List;

import com.nucasim.admin.enumeration.FormaPago;
import com.nucasim.admin.model.RegistroPagos;
import com.nucasim.admin.repository.RegistroPagosRepository;
import com.nucasim.admin.repository.dao.IRegistroPagosDAO;

public class RegistroPagosDAO implements IRegistroPagosDAO{
	
	private final RegistroPagosRepository repository;

	public RegistroPagosDAO(RegistroPagosRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<RegistroPagos> findByFormaPago(FormaPago formaPago) {
		return repository.findByFormaPago(formaPago);
	}
	
	@Override
	public RegistroPagos findByNumeroAndFormaPago(int numero, FormaPago formaPago) {
		return repository.findByNumeroAndFormaPago(numero, formaPago);
	}
	
	@Override
	public RegistroPagos saveRegistroPagos(RegistroPagos registroPago) {
		return repository.save(registroPago);
	}

	@Override
	public RegistroPagos updateRegistroPagos(RegistroPagos registroPago) {
		return repository.save(registroPago);
	}

}
