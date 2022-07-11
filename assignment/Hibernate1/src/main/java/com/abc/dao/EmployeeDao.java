package com.abc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abc.Employee;

//Dao data access object(classes which contain database related code are commonly referred to as Dao classes)
public class EmployeeDao {

	public void add(Employee emp) {
//During this step the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(emp);// persist method will generate insert query

		tx.commit();
		emf.close();
	}

	public Employee fetch(int empno) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		// find method generates select query where primary key =?
		Employee emp = em.find(Employee.class, empno);

		emf.close();

		return emp;

	}

//select query fatchall

	public List<Employee> fetchAll() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e");// ham from ke bad hamesha class name dete hai kuki hamne
																// employee class first me employee class me bana rakhi
																// hai
		List<Employee> List = q.getResultList();

		emf.close();

		return List;

	}

	public List<String> fetchAllNames() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name from Employee e");// yha query me hame name print karna tha isliy
																	// string me dal diya
		List<String> List = q.getResultList();

		emf.close();

		return List;
	}

	public List<Object[]> fetchAllNamesAndSalries() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name,e.salary from Employee e");// yha salary print karna hai name ke sath

		List<Object[]> List = q.getResultList();

		emf.close();

		return List;
	}

	public List<Employee> fetchAllBySalary(double salary) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e where e.salary >= :sal");// yha salary between range what u
																					// have print karna hai name ke sath
		q.setParameter("sal", salary);
		List<Employee> List = q.getResultList();

		emf.close();

		return List;

	}

}