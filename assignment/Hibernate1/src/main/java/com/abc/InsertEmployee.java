package com.abc;

import java.util.List;

import com.abc.dao.EmployeeDao;

public class InsertEmployee {
	private static Object[][] namesAndSalaries;

	public static void main(String[] args) {

		/*
		 * Employee emp = new Employee(); emp.setEmpno(1003); emp.setName("Chandan");
		 * emp.setSalary(20000); emp.setDateOfJoining(LocalDate.of(2023, 10, 10));
		 * 
		 * EmployeeDao dao = new EmployeeDao(); dao.add(emp);
		 */

		/*
		 * EmployeeDao dao = new EmployeeDao();//this code is find someone in our table
		 * Employee emp = dao.fetch(1002); System.out.println(emp.getName() + " " +
		 * emp.getSalary());
		 */

		/*
		 * EmployeeDao dao = new EmployeeDao();//code for select query
		 * List<Employee>list = dao.fetchAll();
		 * 
		 * for (Employee emp : list) System.out.println( emp.getEmpno() + " " +
		 * emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		 */
		/*
		 * EmployeeDao dao = new EmployeeDao();// code for name printing List<String>
		 * names = dao.fetchAllNames();
		 * 
		 * for (String name : names) System.out.println(name);
		 */

		/*
		 * EmployeeDao dao = new EmployeeDao();// code for name printing and salary
		 * printing List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalries();
		 * 
		 * for (Object[] arr : namesAndSalaries) System.out.println(arr[0] + " " +
		 * arr[1]);
		 */

		EmployeeDao dao = new EmployeeDao();
		List<Employee> list1 = dao.fetchAllBySalary(10000);
		for (Employee emp : list1)
			System.out.println(
					emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
	}

	/*
	 * public static void main(String[] args) { // During this step, the
	 * persistence.xml file will be read EntityManagerFactory emf =
	 * Persistence.createEntityManagerFactory("learning-hibernate"); EntityManager
	 * em = emf.createEntityManager(); EntityTransaction tx = em.getTransaction();
	 * tx.begin();
	 * 
	 * Employee emp = new Employee(); emp.setEmpno(1001); emp.setName("jayesh");
	 * emp.setSalary(100000); emp.setDateOfJoining(LocalDate.of(2022, 10, 10));
	 * em.persist(emp); // persist method will generate insert query
	 * 
	 * tx.commit();
	 * 
	 * emf.close(); }
	 */
}
