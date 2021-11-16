package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Entrenadores;

public interface IEntrenadoresDAO {
	
	List<Entrenadores> findByDeshabilitar(Estado deshabilitar);
	
	Entrenadores findByIdentificacionAndDeshabilitar(int identificacion, Estado deshabilitar);
	
	Entrenadores saveEntrenadores(Entrenadores entrenador);
	
	Entrenadores updateEntrenadores(Entrenadores entrenador);

}
