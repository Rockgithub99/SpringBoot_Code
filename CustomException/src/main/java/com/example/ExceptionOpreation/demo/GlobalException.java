package com.example.ExceptionOpreation.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(ResponseApiError.class)

	public ResponseEntity<ApiError> apiExceptionCode() {

		ApiError api = new ApiError();
		api.setLocalDateTime(LocalDateTime.now());
		api.setMessage("Api Error Found");

		List<String> details = new ArrayList<String>();
		details.add(api.getMessage());
		return new ResponseEntity<>(api, HttpStatus.NOT_FOUND);
	}

	
	
	@ExceptionHandler( BadException.class)

	public ResponseEntity<ApiError> customExceptionCode( BadException bx) {
		List<String> details = new ArrayList<String>();
		details.add(bx.getMessage());

		ApiError api = new ApiError();
		api.setLocalDateTime(LocalDateTime.now());
		api.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		api.setErrors(api.getErrors()); 
		api.setMessage("Api Error Found");

		
		return new ResponseEntity<>(api, HttpStatus.NOT_FOUND);
	}
}
