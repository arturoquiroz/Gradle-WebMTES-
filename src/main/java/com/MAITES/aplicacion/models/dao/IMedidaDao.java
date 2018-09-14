package com.MAITES.aplicacion.models.dao;

import java.util.List;

import com.MAITES.aplicacion.models.entities.medida;

public interface IMedidaDao {
	
	public List<medida> findAll();
	
	public medida findOne(int id);

}
