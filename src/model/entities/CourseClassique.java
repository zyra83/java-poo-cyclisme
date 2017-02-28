package model.entities;

public class CourseClassique extends ACourse {

	/**
	 * Longueur de la course en Km.
	 */
	private float longueur;

	public CourseClassique() {
		// Bean
	}
	
	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(longueur);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseClassique other = (CourseClassique) obj;
		if (Float.floatToIntBits(longueur) != Float.floatToIntBits(other.longueur))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CourseClassique [longueur=" + longueur + ", getNom()=" + getNom() + ", getDate()=" + getDate()
				+ ", getEquipes()=" + getEquipes() + "]";
	}

}
