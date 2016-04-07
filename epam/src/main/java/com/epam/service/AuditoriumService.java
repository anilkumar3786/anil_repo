package com.epam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.dao.AuditoriumDAO;
import com.epam.vo.Auditorium;

@Service("auditoriumService")
public class AuditoriumService implements AuditoriumServiceInterface {

	@Autowired
	AuditoriumDAO auditoriumDAO;

	public AuditoriumDAO getAuditoriumDAO() {
		return auditoriumDAO;
	}

	public void setAuditoriumDAO(AuditoriumDAO auditoriumDAO) {
		this.auditoriumDAO = auditoriumDAO;
	}

	public void addAuditorium(Auditorium auditorium) {
		auditoriumDAO.addAuditorium(auditorium);
		
	}

	public void updateAuditorium(Auditorium auditorium) {
		
		auditoriumDAO.updateAuditorium(auditorium);
		
	}

	public List<Auditorium> listAuditoriums() {
		
		return auditoriumDAO.listAuditoriums();
	}

	public Auditorium getAuditoriumById(int id) {
		
		return auditoriumDAO.getAuditoriumById(id);
		
	}

	public void removeAuditorium(int id) {
		
		auditoriumDAO.removeAuditorium(id);
		
	}
	
	
}
