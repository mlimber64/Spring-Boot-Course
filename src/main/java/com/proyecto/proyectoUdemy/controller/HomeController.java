package com.proyecto.proyectoUdemy.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.proyectoUdemy.model.vacante;

@Controller
public class HomeController {
	
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		
		List<vacante> lista = getVacantes();
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
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
		return "home";
	}

	
	private List<vacante> getVacantes(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<vacante> lista = new LinkedList<vacante>();
		
		try {
			
			vacante vacante1 = new vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero Civil");
			vacante1.setDescripcion("Solicitamos Ing.Civil para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2022"));
			vacante1.setSalario(8500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			vacante vacante2 = new vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador Público");
			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia titulado");
			vacante2.setFecha(sdf.parse("09-05-2022"));
			vacante2.setSalario(12000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
			
			vacante vacante3 = new vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero Eléctronico");
			vacante3.setDescripcion("Empresa internacional solicita Ing.Electronico para mantenimiento de instalaciones electronicas");
			vacante3.setFecha(sdf.parse("10-04-2022"));
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			
			
			vacante vacante4 = new vacante();
			vacante4.setId(4);
			vacante4.setNombre("Diseñador Grafico");
			vacante4.setDescripcion("Solicitamios Diseñador Grafico titulado para diseñar publicidad de la empresa");
			vacante4.setFecha(sdf.parse("20-05-2022"));
			vacante4.setSalario(7500.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa3.png");
			
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}catch (ParseException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		return lista;
	}
	
}
