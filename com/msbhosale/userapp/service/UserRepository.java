package com.msbhosale.userapp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msbhosale.userapp.beans.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}