package com.srishti.login;

public class UserDoesNotExistException extends RuntimeException{

	  UserDoesNotExistException(String username) {
	    super("Could not find user " + username);
	  }
}
