package org.team226.kaerengo.data.hbn;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.team226.kaerengo.data.EntityManagerFactoryProvider;
import org.team226.kaerengo.domain.formation.Formation;
import org.team226.kaerengo.domain.formation.SimpleFormation;

@RunWith(MockitoJUnitRunner.class)
public class HbnFormationDaoTest {
	private static HbnFormationDao formationDao;
	private static EntityManager entityManager;
	private Formation formation;

	@BeforeClass
	public static void init() {
		formationDao = new HbnFormationDao();
		EntityManagerFactory emf = EntityManagerFactoryProvider.getFactory();
		entityManager = emf.createEntityManager();

	}

	@AfterClass
	public static void close() {
		entityManager.close();
	}

	@Test
	public void EtandonneUneFormation_QuandElleEstPersistee_AlorsElleResidePermanemmentEnBD() {
		formation = new SimpleFormation("informatique", "une filiere de reve");

		long idFormation = formationDao.addFormation(formation);
		Formation formationPersistee = trouverFormation(idFormation);

		assertEquals(formation, formationPersistee);
	}

	private Formation trouverFormation(long idFormation) {
		return entityManager.find(SimpleFormation.class, idFormation);
	}

}
