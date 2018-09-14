package com.MAITES.aplicacion.models.services;

import java.util.List;

import com.MAITES.aplicacion.models.entities.planta;


public interface IPlantaService {

	public List<planta> findAll();

	public planta findOne(int id);
	
}
