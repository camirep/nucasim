package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.EstadoEstudianteGrupo;
import com.nucasim.admin.model.EstudiantesGrupo;

public interface IEstudiantesGrupoDAO {

	List<EstudiantesGrupo> findByEstadoEstudianteGrupo(EstadoEstudianteGrupo estadoEstudiante);
	
	EstudiantesGrupo findByidEstudianteGrupoAndEstadoEstudianteGrupo(int idEstudianteGrupo, EstadoEstudianteGrupo estadoEstudiante);
	
	EstudiantesGrupo saveEstudiantesGrupo(EstudiantesGrupo estudianteGrupo);
	
	EstudiantesGrupo updateEstudiantesGrupo(EstudiantesGrupo estudianteGrupo);
}
