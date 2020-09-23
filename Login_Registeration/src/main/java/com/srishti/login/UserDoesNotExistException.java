package com.srishti.login;

public class UserDoesNotExistException extends RuntimeException{

	  UserDoesNotExistException(String username) {
	    super("{\r\n" 
	    		+ "    \"status\":\"Couldn't find user.\"\r\n"
	    		+ "}");
	  }
}
