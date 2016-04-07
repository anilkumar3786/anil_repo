package com.epam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.vo.Auditorium;

@Repository("auditoriumDAO")
public class AuditoriumDAO implements AuditoriumDAOInterface {

	@Autowired
	List<Auditorium> auditoriums;

	public void addAuditorium(Auditorium auditorium) {

		auditoriums.add(auditorium);

	}

	public void updateAuditorium(Auditorium auditorium) {

		auditoriums.set(auditorium.getAuditoriumId(), auditorium);

	}

	public List<Auditorium> listAuditoriums() {

		return auditoriums;
	}

	public Auditorium getAuditoriumById(int id) {

		return auditoriums.get(id);
	}

	public void removeAuditorium(int id) {

		auditoriums.remove(id);

	}

}
