package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.dao.DocentDAO;
import be.vdab.entities.Docent;

public class DocentService {
	private final DocentDAO docentDAO = new DocentDAO();

	public Docent read(long id) {
		return docentDAO.read(id);
	}

	public void create(Docent docent) {
		docentDAO.beginTransaction();
		docentDAO.create(docent);
		docentDAO.commit();
	}

	public void delete(long id) {
		docentDAO.beginTransaction();
		docentDAO.delete(id);
		docentDAO.commit();
	}

	public void opslag(long id, BigDecimal percentage) {
		docentDAO.beginTransaction();
		docentDAO.read(id).opslag(percentage);
		docentDAO.commit();
	}
}
