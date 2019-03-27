package com.msbhosale.userapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msbhosale.userapp.beans.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean isValidUser(User user) {

		User userFromDB = userRepository.findByUsername(user.getUsername());
		
		return (user.getUsername().equals(userFromDB.getUsername()) && user.getPassword().equals(userFromDB.getPassword()));
	}

	public void registerUser(User user) {

		userRepository.save(user);
	}
}