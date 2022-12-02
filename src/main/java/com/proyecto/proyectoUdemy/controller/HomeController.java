package com.proyecto.proyectoUdemy.controller;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.proyectoUdemy.model.vacante;
import com.proyecto.proyectoUdemy.service.IVacantesService;

@Controller
public class HomeController {
	
	@Autowired
	private IVacantesService serviceVancante;
	
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<vacante> lista = serviceVancante.findAll();
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		vacante vacante = new vacante();
		vacante.setNombre("Ingeniero de Comunucaciones");
		vacante.setDescripcion("Se solicita ingeniero para soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		
		model.addAttribute("vacante",vacante);
		
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos",lista);
		
		return "listado";
	}
	
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		List<vacante> lista = serviceVancante.findAll();
		model.addAttribute("vacantes", lista);
		return "home";
	}

	
	
}
