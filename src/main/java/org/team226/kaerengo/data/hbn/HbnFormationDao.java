package org.team226.kaerengo.data.hbn;

import javax.persistence.EntityManager;

import org.team226.kaerengo.data.EntityManagerFactoryProvider;
import org.team226.kaerengo.domain.formation.Formation;
import org.team226.kaerengo.domain.formation.FormationDAO;

public class HbnFormationDao implements FormationDAO {

	@Override
	public long addFormation(Formation formation) {
		EntityManager em = EntityManagerFactoryProvider.getFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(formation);
		em.flush();
		em.getTransaction().commit();
		return formation.getId();
	}

}
