package com.example.clientService.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.clientService.entity.SmartPhone;

@RestController

@RequestMapping("/Phone")
public class SmartPhoneController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/getOne")
	public ResponseEntity getAllSmartPhones() {
		SmartPhone phone = new SmartPhone();
		HttpEntity entity = new HttpEntity(phone);

		ResponseEntity ph = restTemplate.exchange("http://localhost:8081/AllPhone/getAll", HttpMethod.GET, entity,
				SmartPhone.class);
		System.out.println(ph.getBody().toString());
		return ph;

	}

	@PostMapping("/save")
	public SmartPhone saveSmartPhone(@RequestBody SmartPhone smartPhone) {
		HttpEntity<SmartPhone> entity = new HttpEntity<SmartPhone>(smartPhone);
		ResponseEntity<SmartPhone> res = restTemplate.exchange("http://localhost:8081/AllPhone/postPhone",
				HttpMethod.POST, entity, SmartPhone.class);
		System.out.println(res.getBody().toString());
		return null;

	}

	
	@PutMapping("/update")
	public SmartPhone update(@RequestBody SmartPhone smartPhone) {
		HttpEntity<SmartPhone> entity = new HttpEntity<SmartPhone>(smartPhone);
		ResponseEntity<SmartPhone> res = restTemplate.exchange("http://localhost:8081/AllPhone/putPhone",
				HttpMethod.PUT, entity, SmartPhone.class);
		System.out.println(res.getBody().toString());
		return null;

	}

	
	@DeleteMapping("/delete/{phoneid}")
	public Integer  deleteSmartPhone(@PathVariable int phoneid) {
		HttpEntity<Integer> entity = new HttpEntity<Integer>(phoneid);
//		Map<String, Integer> map = new HashMap<>();
//		map.put("phoneid", phoneid);
		ResponseEntity response = restTemplate.exchange("http://localhost:8081/AllPhone/deletePhone/{phoneid}",
				HttpMethod.DELETE, entity, SmartPhone.class);

		System.out.println(response.getBody().toString());
		return  phoneid;

	}

}
