package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Profesiones;

public interface ProfesionesRepository extends CrudRepository<Profesiones, Integer>{
	
	List<Profesiones> findByDeshabilitar(Estado deshabilitar);
	
	Profesiones findByCodigoAndDeshabilitar(int codigo, Estado deshabilitar);

}
