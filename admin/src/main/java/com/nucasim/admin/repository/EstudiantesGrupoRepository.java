package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.EstadoEstudianteGrupo;
import com.nucasim.admin.model.EstudiantesGrupo;

public interface EstudiantesGrupoRepository extends CrudRepository<EstudiantesGrupo, Integer>{
	
	List<EstudiantesGrupo> findByEstado(EstadoEstudianteGrupo estadoEstudiante);
	
	EstudiantesGrupo findByIdEstudianteGrupoAndEstado(int idEstudianteGrupo, EstadoEstudianteGrupo estadoEstudiante);
	

}
