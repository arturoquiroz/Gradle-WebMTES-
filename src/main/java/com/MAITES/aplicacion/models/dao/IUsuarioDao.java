package com.MAITES.aplicacion.models.dao;

import java.util.List;

import com.MAITES.aplicacion.models.entities.usuario;


public interface IUsuarioDao {
	
	public List<usuario> findAll();
	
	public usuario findOne(int id);
	
	public usuario findOne(String usuario);

}
