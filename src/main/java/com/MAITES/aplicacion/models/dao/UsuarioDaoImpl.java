package com.MAITES.aplicacion.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.MAITES.aplicacion.models.entities.usuario;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<usuario> findAll() {
		return em.createQuery("from usuario").getResultList();
	}

	@Override
	public usuario findOne(int id) {
		return em.find(usuario.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public usuario findOne(String usuario) {
	Query  query = em.createNativeQuery("select * from usuario where nombre  = "
			+ "'"+usuario+"'");
		List<Object[]> rows = query.getResultList();
		usuario user = new usuario();
		for (Object[] row : rows) {
			user.setIdusuario((int) row[0]);
			user.setNombre((String) row[1]);
			user.setContra((String) row[2]);
		}
		return user;
	}

}
