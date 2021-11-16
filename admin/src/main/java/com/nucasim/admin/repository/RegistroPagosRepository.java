package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.FormaPago;
import com.nucasim.admin.model.RegistroPagos;

public interface RegistroPagosRepository extends CrudRepository<RegistroPagos, Integer>{
	
	List<RegistroPagos> findByFormaPago(FormaPago formaPago);
	
	RegistroPagos findByNumeroAndFormaPago(int numero, FormaPago formaPago);
	

}
