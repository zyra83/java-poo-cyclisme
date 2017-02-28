package model.entities;

public class Entraineur extends AMembre {

	/**
	 * Constructeur Bean
	 */
	public Entraineur() {
		// constructeur bean
	}

	// toString
	@Override
	public String toString() {
		return "Entraineur [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getNumeroLicenceFFC()="
				+ getNumeroLicenceFFC() + ", getEquipe()=" + getEquipe() + "]";
	}

}
