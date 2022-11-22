package com.example.ExceptionOpreation.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.ExceptionOpreation.Entity.Customer;

public interface CustomerRepo  extends CrudRepository<Customer ,Long>{

}
