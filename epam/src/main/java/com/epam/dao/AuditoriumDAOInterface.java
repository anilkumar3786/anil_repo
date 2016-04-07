package com.epam.dao;

import java.util.List;

import com.epam.vo.Auditorium;

public interface AuditoriumDAOInterface {

	public void addAuditorium(Auditorium auditorium);
    public void updateAuditorium(Auditorium auditorium);
    public List<Auditorium> listAuditoriums();
    public Auditorium getAuditoriumById(int id);
    public void removeAuditorium(int id);
}
