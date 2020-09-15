package com.srishti.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserRepo repo;

	UserController(UserRepo repo) {
	    this.repo = repo;
	  }
	
	 @PostMapping("/register")
	  UserEntity registerUser(@RequestBody UserEntity newUser) {
	    return repo.save(newUser);
	  }
	 
	 @GetMapping("/login/{username}")
	 UserEntity loginUser(@PathVariable String username) {
		 return repo.findUserentityByUsername(username).orElseThrow(() -> new UserDoesNotExistException(username));
	 }
	 
	 
	 
}
