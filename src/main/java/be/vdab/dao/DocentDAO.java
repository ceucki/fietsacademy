package be.vdab.dao;

import javax.persistence.EntityManager;

import be.vdab.entities.Docent;

public class DocentDAO {

	public Docent read(long id, EntityManager entityManager){
		return entityManager.find(Docent.class, id);
	}
	
	public void create(Docent docent, EntityManager entityManager){
		entityManager.persist(docent);
	}
	
	public void delete(long id, EntityManager entityManager){
		Docent docent = entityManager.find(Docent.class, id);
		if (docent !=null){
			entityManager.remove(docent);
		}
	}
}
