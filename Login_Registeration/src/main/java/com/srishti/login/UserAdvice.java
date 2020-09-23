package com.srishti.login;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserAdvice {

	@ResponseBody
	  @ExceptionHandler(UserDoesNotExistException.class)
	  @ResponseStatus(HttpStatus.IM_USED)
	  String employeeNotFoundHandler(UserDoesNotExistException ex) {
	    return ex.getMessage();
	  }
	
	@ResponseBody
	@ExceptionHandler(UserAlreadyExistException.class)
	@ResponseStatus(HttpStatus.ALREADY_REPORTED)
	String employeeAlreadyFoundHandler(UserAlreadyExistException ex) {
		return ex.getMessage();
	}
}
