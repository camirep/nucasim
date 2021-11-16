package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.model.UsuariosSistema;

public interface UsuariosSistemaRepository extends CrudRepository<UsuariosSistema, Integer>{
	
	List<UsuariosSistema> findByIdUsuario(int idUsuario);

}
