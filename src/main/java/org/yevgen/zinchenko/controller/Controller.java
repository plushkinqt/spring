package org.yevgen.zinchenko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yevgen.zinchenko.model.Customer;
import org.yevgen.zinchenko.service.MyService;

@RestController
public class Controller {

	@Autowired
	private MyService service;
	
	@RequestMapping("/hello")
	public String test() {
		return "Hello world";
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Customer> listAll() {
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Customer listOne(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST, consumes="application/json")
	public String createCustomer(@RequestBody Customer customer) {
		return service.create(customer);
	}
	
	@RequestMapping(value="/", method=RequestMethod.PUT, consumes="application/json")
	public String updateCustomer(@RequestBody Customer customer){
		return service.update(customer);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable int id) {
		return service.delete(id);
	}
	
}
