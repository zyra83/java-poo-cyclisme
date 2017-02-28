package model.entities;

import java.time.Duration;

public class CourseEtape extends ACourse {

	private Duration duree;

	public CourseEtape() {
		// Bean
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((duree == null) ? 0 : duree.hashCode());
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
		CourseEtape other = (CourseEtape) obj;
		if (duree == null) {
			if (other.duree != null)
				return false;
		} else if (!duree.equals(other.duree))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CourseEtape [duree=" + duree + ", getNom()=" + getNom() + ", getDate()=" + getDate() + ", getEquipes()="
				+ getEquipes() + "]";
	}

}
