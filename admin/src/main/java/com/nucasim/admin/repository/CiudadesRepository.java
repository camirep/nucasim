package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Ciudades;

public interface CiudadesRepository extends CrudRepository<Ciudades, String>{
	
	List<Ciudades> findByDeshabilitar(Estado deshabilitar);
	
	Ciudades findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);

}