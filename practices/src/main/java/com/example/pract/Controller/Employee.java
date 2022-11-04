package com.example.pract.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/newEmployee")
public class Employee {

	@GetMapping("/Emp")
	public String getMessage() {
		String res = "Avi is new employee of shriram company";
		return res;
	}

	@GetMapping("/Comp")
	public Company getByCompany() {
		Company com = new Company(12, "Avi", "Mind nervers pvt ltd");
		return com;
	}

	@GetMapping("/Company")
	public List<Company> getByCompany1() {
		Company com = new Company();
		List<Company> list = new ArrayList<Company>();
		list.add(new Company(2, "Chota Don", "TCS"));
		list.add(new Company(2, "Avi", "MNT"));
		list.add(new Company(2, "Vikas", "TM"));
		list.add(new Company(2, "Yogesh", "Cong"));
		list.add(new Company(2, "Priti", "TCS"));
		return list;
	}

	@GetMapping("/ListComp/{id}")
	public List<Company> getListById(@PathVariable int id) {

		List<Company> list = new ArrayList<Company>();
		list.add(new Company(2, "Chota Don", "TCS"));
		list.add(new Company(3, "Avi", "MNT"));
		list.add(new Company(4, "Vikas", "TM"));
		list.add(new Company(5, "Yogesh", "Cong"));
		list.add(new Company(6, "Priti", "TCS"));

		List<Company> li = new ArrayList<Company>();
		for (Company com : list) {
			if (com.getId() == id)
				;
			li.add(com);
		}
		return li;
	}

	@PostMapping("/postCreate") // create
	public Company createCompany(@RequestBody Company company) {
		System.out.println(company);
		Company com = new Company();
		com.setId(company.getId());
		com.setName(company.getName());
		com.setAddress(company.getAddress());
		return com;

	}

	
	@PutMapping("/upCompany/{id}")
	public List<Company> upadateCompany(@PathVariable int id, @RequestBody Company company) {

		List<Company> list = new ArrayList<Company>();
		list.add(new Company(2, "ChotaDon", "TCS"));
		list.add(new Company(3, "Avi", "MNT"));
		list.add(new Company(4, "Vikas", "TM"));
		list.add(new Company(5, "Yogesh", "Cong"));
		list.add(new Company(6, "Priti", "TCS"));

		for (Company comp : list) {
			if (comp.getId()==id) {
				comp.setId(company.getId());
				comp.setName(company.getName());
				comp.setAddress(company.getAddress());

			}
		}
		return list;

	}
	
	
	@DeleteMapping("/deleteCompany/{id}")
	public List<Company> deleteCompany(@PathVariable int id) {
		
		List<Company> list = new ArrayList<Company>();
		list.add(new Company(2, "ChotaDon", "TCS"));
		list.add(new Company(3, "Avi", "MNT"));
		list.add(new Company(4, "Vikas", "TM"));
		list.add(new Company(5, "Yogesh", "Cong"));
		list.add(new Company(6, "Priti", "TCS"));
		
		

		List<Company> list1 = new ArrayList();

		for (Company com: list) {
			if (com.getId()==id) {

			} else {
				list1.add(com);
			}
		}
		return list1; 
		
	}

	
	
	
	
}
