package com.MAITES.aplicacion.models.services;

import java.util.List;

import com.MAITES.aplicacion.models.entities.medida;


public interface IMedidaService {
	
	public List<medida> findAll();
	
	public medida findOne(int id);

}
