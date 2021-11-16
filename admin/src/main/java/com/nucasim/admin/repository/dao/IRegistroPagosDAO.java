package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.FormaPago;
import com.nucasim.admin.model.RegistroPagos;

public interface IRegistroPagosDAO {
	
	List<RegistroPagos> findByFormaPago(FormaPago formaPago);
	
	RegistroPagos findByNumeroAndFormaPago(int numero, FormaPago formaPago);
	
	RegistroPagos saveRegistroPagos(RegistroPagos registroPago);
	
	RegistroPagos updateRegistroPagos(RegistroPagos registroPago);

}
