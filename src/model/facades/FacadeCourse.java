package model.facades;

import java.util.ArrayList;
import java.util.List;

import model.contrats.IFacadeCourse;
import model.entities.ACourse;
import model.entities.Equipe;

public class FacadeCourse implements IFacadeCourse {

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.facades.IFacadeCourse#inscription(model.entities.Equipe,
	 * model.entities.ACourse)
	 */
	@Override
	public void inscription(Equipe equipe, ACourse course) {
		course.inscrireEquipe(equipe);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.facades.IFacadeCourse#listingEquipe(model.entities.ACourse)
	 */
	@Override
	public List<Equipe> listingEquipe(ACourse course) {
		ArrayList<Equipe> retour = new ArrayList<Equipe>();

		for (Equipe equipe : course.getEquipes()) {
			retour.add(equipe);
		}

		return retour;
	}

}
