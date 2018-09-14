package com.MAITES.aplicacion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MAITES.aplicacion.models.dao.IUsuarioDao;
import com.MAITES.aplicacion.models.entities.usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuariodao;
	
	@Override
	public List<usuario> findAll() {
		return usuariodao.findAll();
	}

	@Override
	public usuario findOne(int id) {
		return usuariodao.findOne(id);
	}

	@Override
	public usuario findOne(String username) {
		 return usuariodao.findOne(username);	
	}

}
