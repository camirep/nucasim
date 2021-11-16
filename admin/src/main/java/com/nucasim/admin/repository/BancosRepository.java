package com.nucasim.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Bancos;


public interface BancosRepository extends CrudRepository<Bancos, String>{
	
	List<Bancos> findByDeshabilitar(Estado deshabilitar);
	
	Bancos findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);	

}
