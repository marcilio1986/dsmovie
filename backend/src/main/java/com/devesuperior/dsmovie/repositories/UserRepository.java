package com.devesuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User FindByEmail(String Email);

}

