package com.example.ExceptionOpreation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExceptionOpreation.demo.BadException;
import com.example.ExceptionOpreation.demo.ResponseApiError;

@RestController

@RequestMapping("/Custom")
public class CustomExceptionController {
	
	
	@GetMapping("/getCustom/{id}")

	
	public String getApi(@PathVariable String id) {
		
		if(id.equals("Abc")) {
			throw new ResponseApiError("Api Error Found");
		}
		
		
		return "Retuen the id :" +id;
		
	}
	
	

	@GetMapping("/getCustomException/{id}")

	
	public String getCustomException(@PathVariable String id) {
		
		if(id.equals("Abc")) {
			throw new  BadException(HttpStatus.BAD_REQUEST);
		}
		
		
		return "Retuen the request id :" +id;
		
	}
}
