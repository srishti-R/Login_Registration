package com.srishti.login;

public class UserAlreadyExistException extends RuntimeException {
	
	  UserAlreadyExistException() {
		    super("{\r\n" 
		    		+ "    \"status\":\"User already exists!!\"\r\n"
		    		+ "}");
		  }
}
