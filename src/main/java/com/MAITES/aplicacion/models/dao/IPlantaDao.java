package com.MAITES.aplicacion.models.dao;

import java.util.List;

import com.MAITES.aplicacion.models.entities.planta;


public interface IPlantaDao {
	
	public List<planta> findAll();

	public planta findOne(int id);

}
