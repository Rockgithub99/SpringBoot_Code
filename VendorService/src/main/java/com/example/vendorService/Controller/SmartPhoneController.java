package com.example.vendorService.Controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendorService.Repository.SmartPhoneRepo;
import com.example.vendorService.entity.SmartPhone;

@RestController

@RequestMapping("/AllPhone")
public class SmartPhoneController {
	
	@Autowired
	
	SmartPhoneRepo smartPhoneRepo;
	
	
	@GetMapping("/getPhone")
	public List<SmartPhone> getAllSmartPhone() {
		
		List<SmartPhone> phone= smartPhoneRepo.findAll();
		return  phone;
		
	}
	
	
	@GetMapping("/getAll")
	public SmartPhone  getSmartPhone() {
		SmartPhone Phone= new SmartPhone(12,"Apple","A1");
		
		return Phone;
		
	}
	
	
	@PostMapping("/postPhone")
  public SmartPhone createSmartPhone(@RequestBody SmartPhone smartPhone){
		
	SmartPhone ph=smartPhoneRepo.save(smartPhone);
		
	return ph;
		
	}
	
	
	@PutMapping("/putPhone")
	
	public SmartPhone updateSmartPhone(@RequestBody SmartPhone smartPhone){
		Optional<SmartPhone> smart=smartPhoneRepo.findById(smartPhone.getPhoneid());
		SmartPhone phone2=smart.get();
		phone2.setPhonemodel(smartPhone.getPhonemodel());
		phone2.setPhonename(smartPhone.getPhonename());
		 smartPhoneRepo.save(phone2);
		return phone2;
		
	}
	
	
	
	@DeleteMapping("/deletePhone/{phoneid}")
	public int phoneDelete(@PathVariable int phoneid) {
		smartPhoneRepo.deleteById(phoneid);
		return phoneid;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
