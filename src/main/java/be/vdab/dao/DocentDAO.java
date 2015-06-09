package be.vdab.dao;

import javax.persistence.EntityManager;

import be.vdab.entities.Docent;

public class DocentDAO {

	public Docent read(long id, EntityManager entityManager){
		return entityManager.find(Docent.class, id);
	}
}
