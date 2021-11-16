package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.model.RepositorioDoc;

public interface IRepositorioDocDAO {
	
	List<RepositorioDoc> findById(int idRepositorio);
	
	RepositorioDoc saveRepositorioDoc(RepositorioDoc repositorioDoc);
	
	RepositorioDoc updateRepositorioDoc(RepositorioDoc repositorioDoc);

}
