package com.example.ExceptionOpreation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExceptionOpreation.Entity.Customer;
import com.example.ExceptionOpreation.Service.CustomerService;

@RestController

@RequestMapping("/Custom")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") Long id) {
		return customerService.getCustomer(id);
	}

	// Add new Customer
	@PostMapping("/addCustomer")
	public String addcustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	// Update Customer details
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

}
