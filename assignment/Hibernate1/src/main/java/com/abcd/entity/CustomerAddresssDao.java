package com.abcd.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomerAddresssDao {

	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); // persist method will generate insert query

		tx.commit();
		emf.close();
	}

	public void add(Address addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); // persist method will generate insert query

		tx.commit();
		emf.close();
	}

	public List<Customer> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer> list = q.getResultList();

		emf.close();

		return list;
	}
}