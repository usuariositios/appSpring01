package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.empresa.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(" SELECT u FROM User u "			
			+ " where u.username = :username  ")
	List<User> findByUserName(@Param("username") String username);
	
	User findByUsername(String username);
	
	

}
