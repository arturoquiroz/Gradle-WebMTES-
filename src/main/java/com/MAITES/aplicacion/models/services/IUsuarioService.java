package com.MAITES.aplicacion.models.services;

import java.util.List;

import com.MAITES.aplicacion.models.entities.usuario;


public interface IUsuarioService {

	public List<usuario> findAll();
	
	public usuario findOne(int id);

	public usuario findOne(String username);
	
}
