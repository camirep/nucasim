package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.model.UsuariosSistema;

public interface IUsuariosSistemaDAO {

	List<UsuariosSistema> findByIdUsuario(int idUsuario);
	
	UsuariosSistema saveUsuariosSistema(UsuariosSistema usuarioSistema);
	
	UsuariosSistema updateUsuariosSistema(UsuariosSistema usuarioSistema);
}
