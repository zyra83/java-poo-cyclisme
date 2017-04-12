package model.contrats;

import java.util.List;

import model.entities.ACourse;
import model.entities.Equipe;

public interface IFacadeCourse {

	/**
	 * Permet d'inscrire une équipe à une course.
	 * 
	 * @param equipe
	 * @param course
	 */
	void inscription(Equipe equipe, ACourse course);

	/**
	 * Permet de lister les équipes d'une course.
	 * 
	 * @param course
	 */
	List<Equipe> listingEquipe(ACourse course);

}