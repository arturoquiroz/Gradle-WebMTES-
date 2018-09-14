package com.MAITES.aplicacion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MAITES.aplicacion.models.dao.IMedidaDao;
import com.MAITES.aplicacion.models.entities.medida;


@Service
public class MedidaServiceImpl implements IMedidaService {
	
	@Autowired
	private IMedidaDao medidadao;

	@Override
	@Transactional(readOnly = true)
	public List<medida> findAll() {
		return medidadao.findAll();
	}

	@Override
	public medida findOne(int id) {
		return medidadao.findOne(id);
	}

}
