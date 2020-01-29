package org.antislashn.cinema.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import org.antislashn.cinema.dao.FilmDao;
import org.antislashn.cinema.entities.Film;

@Singleton
public class CinemaService {
	@EJB private FilmDao dao;
	
	public List<Film> findAllFilms(){
		return dao.findAll();
	}
}
