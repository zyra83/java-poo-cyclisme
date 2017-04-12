package model.entities;

public class Entraineur extends AMembre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7078180335551452986L;

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
