package org.yevgen.zinchenko.service;

import java.util.List;

import org.yevgen.zinchenko.model.Customer;

public interface MyService {

	List<Customer> findAll();
	String create(Customer customer);
	String update(Customer customer);
	Customer findOne(int id);
	String delete(int id);

}
