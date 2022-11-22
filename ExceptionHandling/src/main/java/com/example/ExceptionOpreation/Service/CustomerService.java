package com.example.ExceptionOpreation.Service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExceptionOpreation.Entity.Customer;
import com.example.ExceptionOpreation.Exception.CustomerAlreadyExistsException;
import com.example.ExceptionOpreation.Exception.NoSuchCustomerExistsException;
import com.example.ExceptionOpreation.Repo.CustomerRepo;

@Service
public class CustomerService implements CustomerImp {
	
	@Autowired
	CustomerRepo customerRepo;

	public Customer getCustomer(Long id) {
		return customerRepo.findById(id)
				.orElseThrow(() -> new NoSuchElementException("NO CUSTOMER PRESENT WITH ID = " + id));
	}


	// CustomerAlreadyExistsException when customer detail
	
	public String addCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null) {
			customerRepo.save(customer);
			return "Customer added successfully";
		} else
			throw new CustomerAlreadyExistsException("Customer already exists!!");
	}

	
	// NoSuchCustomerExistsException when customer doesn't
	
	public String updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
		if (existingCustomer == null)
			throw new NoSuchCustomerExistsException("No Such Customer exists!!");
		else {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRepo.save(existingCustomer);
			return "Record updated Successfully";
		}
	}

}
