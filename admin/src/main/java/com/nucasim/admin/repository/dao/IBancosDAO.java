package com.nucasim.admin.repository.dao;

import java.util.List;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Bancos;

public interface IBancosDAO {
	
	List<Bancos> findByDeshabilitar(Estado deshabilitar);
	
	Bancos findByCodigoAndDeshabilitar(String codigo, Estado deshabilitar);

}
