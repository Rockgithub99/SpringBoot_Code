package com.example.ExceptionOpreation.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	
	 private LocalDateTime localDateTime;
     private HttpStatus status;
     private String message;
     private List errors;
	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiError(LocalDateTime localDateTime, HttpStatus status, String message, List errors) {
		super();
		this.localDateTime = localDateTime;
		this.status = status;
		this.message = message;
		this.errors = errors;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List getErrors() {
		return errors;
	}
	public void setErrors(List errors) {
		this.errors = errors;
	}
	@Override
	public String toString() {
		return "ApiError [localDateTime=" + localDateTime + ", status=" + status + ", message=" + message + ", errors=" + errors
				+ "]";
	}
	
     
     
     

}
