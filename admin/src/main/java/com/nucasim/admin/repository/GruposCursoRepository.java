package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.EstadoGrupoCurso;
import com.nucasim.admin.model.GruposCurso;

public interface GruposCursoRepository extends CrudRepository<GruposCurso, Integer>{
	
	List<GruposCurso> findByEstado(EstadoGrupoCurso estadoGrupoCurso);
	
	GruposCurso findByGrupoAndEstado(int grupo, EstadoGrupoCurso estadoGrupoCurso);


}
