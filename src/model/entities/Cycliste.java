package model.entities;

/**
 * Un Cycliste, membre d'une équipe.
 * @author VOTRE_NOM
 *
 */
public class Cycliste extends AMembre {

	private int classement;

	/**
	 * Constructeur Bean
	 */
	public Cycliste() {
		// constructeur bean
	}
	
	public int getClassement() {
		return classement;
	}
	
	public void setClassement(int classement) {
		this.classement = classement;
	}

	// toString
	@Override
	public String toString() {
		return "Cycliste [classement=" + classement + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getNumeroLicenceFFC()=" + getNumeroLicenceFFC() + ", getEquipe()=" + getEquipe() + "]";
	}
}
