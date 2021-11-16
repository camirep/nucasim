package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Cursos;

public interface CursosRepository extends CrudRepository<Cursos, String>{
	
	List<Cursos> findByDeshabilitar(Estado deshabilitar);
	
	Cursos findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);

}