package com.MAITES.aplicacion.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.MAITES.aplicacion.models.entities.planta;

@Repository
public class PlantaDaoImpl implements IPlantaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<planta> findAll() {
		return em.createQuery("from planta").getResultList();
	}

	@Override
	public planta findOne(int id) {
		return em.find(planta.class, id);
	}

}
