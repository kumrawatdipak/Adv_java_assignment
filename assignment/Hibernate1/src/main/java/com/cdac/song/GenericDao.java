package com.cdac.song;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {

	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			em.merge(obj);// merge method is used for insert and update two in one functionality
							// try is used because of primary key in merge method
			tx.commit();
		} finally {
			emf.close();
		}
	}

//now we write to find something so we used fetch 
	public Object fetchById(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			Object obj = em.find(clazz, pk);
			return obj;

		} finally {
			emf.close();
		}
	}

	public void delete(Class clazz, Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			Object obj = em.find(clazz, pk);
			em.remove(obj);

			tx.commit();

		} finally {
			emf.close();

		}
	}
}
