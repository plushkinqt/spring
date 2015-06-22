package org.yevgen.zinchenko.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yevgen.zinchenko.model.Customer;
import org.yevgen.zinchenko.repository.CustomerRepository;

@Service
public class ServiceImplementation implements MyService{

	@Resource
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
}
