package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.CompanyRepo;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
@RequestMapping("/startComp")

public class CompanyController {
	@Autowired
	CompanyRepo companyRepo;

	@GetMapping("/getCom")
	public List<Company> getCompany() {
		List<Company> company = (List<Company>) companyRepo.findAll();
		return company;
	}

	@PostMapping("/postCom")
	public Company saveCompany(@RequestBody Company company) {
		Company com = companyRepo.save(company);
		return com;
	}

	@DeleteMapping("/deleteCom/{id}")

	public Integer deleteCompany(@PathVariable Integer id) {

		companyRepo.deleteById(id);
		return id;
	}
	
	

	@PutMapping("/putCom")

	public Company upadateCompany(@RequestBody Company company) {
		java.util.Optional<Company> result= companyRepo.findById(company.getId());


		Company company1 = result.get();
		company1.setName(company.getName());
		company1.setAddress(company.getAddress());

		
		companyRepo.save(company1);
		return company1;

	}

}
