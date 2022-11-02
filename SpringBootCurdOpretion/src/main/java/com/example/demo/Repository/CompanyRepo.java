package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Controller.Company;

public interface CompanyRepo  extends CrudRepository<Company,Integer>{

}
