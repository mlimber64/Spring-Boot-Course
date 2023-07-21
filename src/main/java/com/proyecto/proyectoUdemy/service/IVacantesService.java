package com.proyecto.proyectoUdemy.service;

import java.util.List;

import com.proyecto.proyectoUdemy.model.vacante;

public interface IVacantesService {
	
	List<vacante> findAll();
	
	vacante buscarxId(Integer id);

}
