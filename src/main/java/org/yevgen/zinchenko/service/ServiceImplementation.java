package org.yevgen.zinchenko.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yevgen.zinchenko.model.Customer;
import org.yevgen.zinchenko.repository.CustomerRepository;

@Service
public class ServiceImplementation implements MyService{
	
	private final String OPERATION_SUCCESS = "Operation succeded";
	private final String OPERATION_FAIL = "Operation failed";

	@Resource
	private CustomerRepository customerRepository;
	
	@Transactional
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Transactional
	public Customer findOne(int id){
		return customerRepository.findOne(id);
	}
	@Transactional
	public String create(Customer customer) {
		customerRepository.saveAndFlush(customer);
		return OPERATION_SUCCESS;
	}
	
	@Transactional
	public String update(Customer customer){
		if (!customerRepository.exists(customer.getId())){
			return OPERATION_FAIL;
		}
		customerRepository.saveAndFlush(customer);
		return OPERATION_SUCCESS;
	}
	
	@Transactional
	public String delete(int id){
		if (!customerRepository.exists(id)){
			return OPERATION_FAIL;
		}
		customerRepository.delete(id);;
		return OPERATION_SUCCESS;
	}
	
}
