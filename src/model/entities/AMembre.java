package model.entities;

/**
 * Un membre de la fédération cycliste. À ce titre il a un numéro de licence
 * unique qui permet de l'identifier. Un membre étant forcement Cycliste ou
 * entraineur cette classe est abstraite. Le numéro de licence permettant
 * d'identifier Cyclistes et Entrianeurs, le hashcode ne sera pas redéfini.
 * 
 * @author VOTRE_NOM
 *
 */
public abstract class AMembre {
	private String nom;
	private String prenom;
	/**
	 * Numéro de licence un membre de la fédération cycliste. Identifie de façon
	 * unique Cyclistes et Entraineurs.
	 */
	private String numeroLicenceFFC;
	/**
	 * L'equipe dans laquelle est engagé le memebre.
	 */
	private Equipe equipe;

	// accesseurs

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroLicenceFFC() {
		return numeroLicenceFFC;
	}

	public void setNumeroLicenceFFC(String numeroLicenceFFC) {
		this.numeroLicenceFFC = numeroLicenceFFC;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	// Equals/hashCode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroLicenceFFC == null) ? 0 : numeroLicenceFFC.hashCode());
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
		AMembre other = (AMembre) obj;
		if (numeroLicenceFFC == null) {
			if (other.numeroLicenceFFC != null)
				return false;
		} else if (!numeroLicenceFFC.equals(other.numeroLicenceFFC))
			return false;
		return true;
	}

	// ToString

	@Override
	public String toString() {
		return "AMembre [nom=" + nom + ", prenom=" + prenom + ", numeroLicenceFFC=" + numeroLicenceFFC + ", equipe="
				+ equipe + "]";
	}

}
