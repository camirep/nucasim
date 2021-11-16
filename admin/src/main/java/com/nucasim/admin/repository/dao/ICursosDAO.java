package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Cursos;

public interface ICursosDAO {
	
	List<Cursos> findByDeshabilitar(Estado deshabilitar);
	
	Cursos findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);
	
	Cursos saveCurso(Cursos curso);
	
	Cursos updateCurso(Cursos curso);

}
