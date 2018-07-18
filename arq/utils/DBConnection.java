package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	
	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager entityManager;
	
	public DBConnection() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("residencia_bar");
		this.entityManager = entityManagerFactory.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}	

}
