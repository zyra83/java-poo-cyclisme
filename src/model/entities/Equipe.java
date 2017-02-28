package model.entities;

import java.util.List;

public class Equipe {

	private String nom;
	private List<AMembre> membres;
	private List<ACourse> courses;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<AMembre> getMembres() {
		return membres;
	}

	public void setMembres(List<AMembre> membres) {
		this.membres = membres;
	}

	public List<ACourse> getCourses() {
		return courses;
	}

	public void setCourses(List<ACourse> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Equipe [nom=" + nom + ", membres=" + membres + ", courses=" + courses + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Equipe other = (Equipe) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

}
