package org.yevgen.zinchenko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
