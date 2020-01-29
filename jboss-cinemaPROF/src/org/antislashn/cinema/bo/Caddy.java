package org.antislashn.cinema.bo;



import java.util.ArrayList;
import java.util.List;
import org.antislashn.cinema.entities.Film;

public class Caddy {
	List<Film> films = new ArrayList<>();
	
	public void add(Film film) {
		films.add(film);
	}
	
	public void remove(Film film) {
		films.remove(film);
	}
	
	public double getPrixTotalHT() {
		double total = 0;
		for(Film f : films)
			total += f.getPrixHT();
		return total;
	}
	
}
