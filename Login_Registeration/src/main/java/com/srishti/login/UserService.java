package com.srishti.login;

import java.util.stream.Collectors;


public class UserService {
	
	private UserRepo userRepo;
	
	UserEntity saveUser(UserEntity user) {
		return userRepo.save(user);
	}
	
	java.util.List<UserEntity> getUser(String username) {
		return userRepo.findAll().stream().filter(p -> p.username.equals(username)).collect(Collectors.toList());
	}
	
	

}
