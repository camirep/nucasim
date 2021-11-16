package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Profesiones;

public interface IProfesionesDAO {
	
	List<Profesiones> findByDeshabilitar(Estado deshabilitar);
	
	Profesiones findByCodigoAndDeshabilitar(int codigo, Estado deshabilitar);
	
	Profesiones saveProfesiones(Profesiones profesion);
	
	Profesiones updateProfesiones(Profesiones profesion);

}
