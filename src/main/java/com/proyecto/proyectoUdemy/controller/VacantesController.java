package com.proyecto.proyectoUdemy.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.proyectoUdemy.model.vacante;
import com.proyecto.proyectoUdemy.service.IVacantesService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	@Autowired
	private IVacantesService serviceVancante;
	
	@GetMapping("/create")
	public String crear() {
		
		return "vacantes/formVacante";
	}
	/*
	@PostMapping("/save")
	public String save(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion ,
			           @RequestParam("estatus") String estatus, @RequestParam("fecha") String fecha , @RequestParam("destacado") int destacado,
			           @RequestParam("salario") double salario , @RequestParam("detalles") String detalles) {
		
		System.out.println("Nombre " + nombre);
		System.out.println("Descripcion " + descripcion);
		System.out.println("Estatus " + estatus);
		System.out.println("Fecha " + fecha);
		System.out.println("Destacado " + destacado);
		System.out.println("Salario " + salario);
		System.out.println("Detalles " + detalles);
		
		
		return "vacantes/listVacantes";
	}
	*/
	
	@PostMapping("/save")
	public String save(vacante vacan) {
		
		serviceVancante.guardar(vacan);
		System.out.println("vacantee:" + vacan);
		
		
		return "detalle";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
		
		vacante vacante = serviceVancante.buscarxId(idVacante);
		
		System.out.println("idVacante: " + idVacante);
		model.addAttribute("vacante" , vacante);
		return "detalle";
	}
	
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante,Model model) {
		
		vacante vacante = serviceVancante.buscarxId(idVacante);
		
		System.out.println("idVacante: " + idVacante);
		model.addAttribute("vacante" , vacante);
		return "mensaje";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

}
