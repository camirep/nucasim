package com.nucasim.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.model.Cursos;
import com.nucasim.admin.repository.dao.ICursosDAO;

@Controller
@RequestMapping("/cursos")
public class CursosController {
	private final ICursosDAO cursosDAO;
	
	public CursosController(ICursosDAO cursosDAO) {
		super();
		this.cursosDAO = cursosDAO;
	}

	@GetMapping("/listado")
	List<Cursos> getAllCursos(){
		return cursosDAO.findByDeshabilitar(Estado.ACTIVO);
	}
	
	@PostMapping("/guardar")
	public String guardarCurso(Cursos curso, BindingResult result, Model model) {
		if (result.hasErrors()) {
            return "";
        }
		cursosDAO.saveCurso(curso);
        return "";
	}
	
	@PostMapping("/modificar")
	public String updateCurso(Cursos curso, BindingResult result, Model model) {
		if (result.hasErrors()) {
            return "";
        }
		cursosDAO.updateCurso(curso);
		return "";
	}
	

}
