package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.model.UsuariosSistema;
import com.nucasim.admin.repository.UsuariosSistemaRepository;
import com.nucasim.admin.repository.dao.IUsuariosSistemaDAO;
@Repository
public class UsuariosSistemaDAO implements IUsuariosSistemaDAO{
	
	private final UsuariosSistemaRepository repository;

	public UsuariosSistemaDAO(UsuariosSistemaRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<UsuariosSistema> findByIdUsuario(int idUsuario) {
		return repository.findByIdUsuario(idUsuario);
	}
	
	@Override
	public UsuariosSistema saveUsuariosSistema(UsuariosSistema usuarioSistema) {
		return repository.save(usuarioSistema);
	}

	@Override
	public UsuariosSistema updateUsuariosSistema(UsuariosSistema usuarioSistema) {
		return repository.save(usuarioSistema);
	}

}
