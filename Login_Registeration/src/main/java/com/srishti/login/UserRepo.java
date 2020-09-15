package com.srishti.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepo extends JpaRepository<UserEntity, Long>{

	Optional<UserEntity> findUserentityByUsername(String username);
}
