package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.EstadoGrupoCurso;
import com.nucasim.admin.model.GruposCurso;

public interface IGruposCursoDAO {
	
	List<GruposCurso> findByEstadoGrupoCurso(EstadoGrupoCurso estadoGrupoCurso);
	
	GruposCurso findByGrupoAndGrupoCurso(int grupo, EstadoGrupoCurso estadoGrupoCurso);
	
	GruposCurso saveGruposCurso(GruposCurso grupoCurso);
	
	GruposCurso updateGruposCurso(GruposCurso grupoCurso);

}
