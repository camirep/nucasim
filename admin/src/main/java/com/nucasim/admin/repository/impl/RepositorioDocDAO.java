package com.nucasim.admin.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nucasim.admin.model.RepositorioDoc;
import com.nucasim.admin.repository.RepositorioDocRepository;
import com.nucasim.admin.repository.dao.IRepositorioDocDAO;
@Repository
public class RepositorioDocDAO implements IRepositorioDocDAO{
	
	private final RepositorioDocRepository repository;

	public RepositorioDocDAO(RepositorioDocRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public List<RepositorioDoc> findById(int idRepositorio) {
		return repository.findById(idRepositorio);
	}
	
	@Override
	public RepositorioDoc saveRepositorioDoc(RepositorioDoc repositorioDoc) {
		return repository.save(repositorioDoc);
	}

	@Override
	public RepositorioDoc updateRepositorioDoc(RepositorioDoc repositorioDoc) {
		return repository.save(repositorioDoc);
	}
}
