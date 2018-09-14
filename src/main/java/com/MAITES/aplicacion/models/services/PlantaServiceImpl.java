package com.MAITES.aplicacion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MAITES.aplicacion.models.dao.IPlantaDao;
import com.MAITES.aplicacion.models.entities.planta;


@Service
public class PlantaServiceImpl implements IPlantaService {

	@Autowired
	private IPlantaDao plantadao;
	
	@Override
	@Transactional(readOnly = true)
	public List<planta> findAll() {
		return plantadao.findAll();
	}

	@Override
	public planta findOne(int id) {
		return plantadao.findOne(id);
	}

}
