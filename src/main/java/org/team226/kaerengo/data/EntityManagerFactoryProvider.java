package org.team226.kaerengo.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {

	private static final String EM_NAME = "kaerengo";

	private static EntityManagerFactory instance;

	public static EntityManagerFactory getFactory() {
		if (instance == null) {
			instance = Persistence.createEntityManagerFactory(EM_NAME);
		}
		return instance;
	}

}
