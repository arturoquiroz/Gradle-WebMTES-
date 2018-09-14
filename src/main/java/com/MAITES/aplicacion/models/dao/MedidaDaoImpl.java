package com.MAITES.aplicacion.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.MAITES.aplicacion.models.entities.medida;

@Repository
public class MedidaDaoImpl implements IMedidaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<medida> findAll() {
		return em.createQuery("from medida").getResultList();
	}

	@Override
	public medida findOne(int id) {
		return em.find(medida.class, id);
	}

}
