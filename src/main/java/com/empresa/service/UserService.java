package com.empresa.service;



import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.empresa.entity.User;


@Service
public interface UserService {
	
	public abstract List<User> getUsers();
	public abstract UserDetails loadUserByUsername(String username);
	public abstract User save(User user);
	 

}
