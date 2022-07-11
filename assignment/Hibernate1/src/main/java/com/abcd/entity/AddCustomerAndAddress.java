package com.abcd.entity;

import java.util.List;

public class AddCustomerAndAddress {

	public static void main(String[] args) {

		CustomerAddresssDao dao = new CustomerAddresssDao();
		/*
		 * Customer c = new Customer(); c.setName("jayesh");
		 * c.setEmail("kumrawatjayesh927@gmail.com"); // dao.add(c);
		 * 
		 * Address a = new Address(); a.setPincode("451225"); a.setCity("amrawati");
		 * a.setState("mh");
		 * 
		 * c.setAddress(a); dao.add(c);
		 */

		Customer c = new Customer();
		List<Customer> list = dao.fetchCustomersByEmail("jayesh");
		for (Customer cd : list)
			System.out.println(cd.getName() + " " + cd.getEmail());
	}

}
