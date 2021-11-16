package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.model.RepositorioDoc;

public interface RepositorioDocRepository extends CrudRepository<RepositorioDoc, Integer>{
	
	List<RepositorioDoc> findById(int idRepositorio);

}
