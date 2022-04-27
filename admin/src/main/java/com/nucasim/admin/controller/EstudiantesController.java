package com.nucasim.admin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nucasim.admin.enumeration.Estado;
import com.nucasim.admin.enumeration.TipoIdentif;
import com.nucasim.admin.model.Estudiantes;
import com.nucasim.admin.repository.dao.ICiudadesDAO;
import com.nucasim.admin.repository.dao.IEstudiantesDAO;
import com.nucasim.admin.repository.dao.IProfesionesDAO;

@Controller
@RequestMapping("/estudiantes")
public class EstudiantesController {
	
	private final IEstudiantesDAO estudiantesDAO;
	private final ICiudadesDAO ciudadesDAO;
	private final IProfesionesDAO profesionesDAO;

	public EstudiantesController(IEstudiantesDAO estudiantesDAO, ICiudadesDAO ciudadesDAO, IProfesionesDAO profesionesDAO) {
		super();
		this.estudiantesDAO = estudiantesDAO;
		this.ciudadesDAO = ciudadesDAO;
		this.profesionesDAO = profesionesDAO;
	}
	
	@GetMapping("/listadoEstudiantes")
	public String getAllEstudiantes(Model model) {
		model.addAttribute("estudiantes", estudiantesDAO.findAll());
	    return "htmls/estudianteListado";
	}
	
	@GetMapping("/addEstudiante")
	public String addEstudiante(Model model) {
		model.addAttribute("tiposIdentificacion", Arrays.asList(TipoIdentif.values()));
		model.addAttribute("ciudades", ciudadesDAO.findByDeshabilitar(Estado.ACTIVO));
		model.addAttribute("profesiones", profesionesDAO.findByDeshabilitar(Estado.ACTIVO));
		System.out.println(model);
	    return "htmls/estudiante";
	}
	
	@PostMapping("/addEstudiantesss")
    public String saveEstudiantes(Estudiantes estudiante, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "htmls/estudiante";
        }
        
        estudiantesDAO.saveEstudiantes(estudiante);
        return "redirect:/htmls/estudianteListado";
	} 

}
