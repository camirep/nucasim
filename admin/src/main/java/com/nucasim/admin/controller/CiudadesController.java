package com.nucasim.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Ciudades;
import com.nucasim.admin.repository.dao.ICiudadesDAO;

@Controller
@RequestMapping("/ciudades")
public class CiudadesController {

	private final ICiudadesDAO ciudadesDAO;

	public CiudadesController(ICiudadesDAO ciudadesDAO) {
		super();
		this.ciudadesDAO = ciudadesDAO;
	}
	
	@GetMapping("/listado")
	List<Ciudades> getAllCiudades(){
		return ciudadesDAO.findByDeshabilitar(Estado.ACTIVO);
	}
	
}
