package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Ciudades;

public interface ICiudadesDAO {
	
	List<Ciudades> findByDeshabilitar(Estado deshabilitar);
	
	Ciudades findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);

}
