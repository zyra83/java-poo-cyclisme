package model.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class ACourse {
	
	private String nom;
	private LocalDateTime date;
	/**
	 * Liste des équipes inscrites à cette course.
	 */
	private List<Equipe> equipes = new ArrayList<Equipe>();

	// accesseurs

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	// services
	
	/**
	 * Service permettant d'inscrire une équipe à la course.
	 * 
	 * @param equipe
	 */
	public void inscrireEquipe(Equipe equipe) {
		this.equipes.add(equipe);
	}

	// hashCode, equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ACourse other = (ACourse) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	// toString

	@Override
	public String toString() {
		return "ACourse [nom=" + nom + ", date=" + date + ", equipes=" + equipes + "]";
	}


}
