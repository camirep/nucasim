package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Entrenadores;

public interface EntrenadoresRepository extends CrudRepository<Entrenadores, Integer>{
	
	List<Entrenadores> findByDeshabilitar(Estado deshabilitar);
	
	Entrenadores findByIdentificacionAndDeshabilitar(int identificacion, Estado deshabilitar);
	
}
