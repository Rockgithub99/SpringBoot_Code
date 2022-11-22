package com.example.ExceptionOpreation.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadException  extends  RuntimeException{
	
	
	public BadException(HttpStatus badRequest) {
		// TODO Auto-generated constructor stub
	}

}
