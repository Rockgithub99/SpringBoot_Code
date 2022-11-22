package com.example.ExceptionOpreation.Service;

import org.springframework.stereotype.Service;

import com.example.ExceptionOpreation.Entity.Customer;


@Service
public interface CustomerImp {
	
	Customer getCustomer(Long id);
	 
    
    String addCustomer(Customer customer);
 
    
    String updateCustomer(Customer customer);

}
