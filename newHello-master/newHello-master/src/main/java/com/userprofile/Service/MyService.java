package com.userprofile.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.userprofile.Entity.User;
import com.userprofile.Repository.UsersRepo;

@Service
public class MyService {
	
	@Autowired
	UsersRepo userRepo;
	
	
	public List<User> getUsers(){		
		return userRepo.findAll();		
	}
	
	public Optional<User> getUser(int u) {
		return userRepo.findById(u);
	}
	
	public List<User> loginByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findDetailsByEmail(email);
	}

	public User saveUsers(User user) {
		return userRepo.save(user);
	}

	public User updateUser(User user) {
		return userRepo.save(user);
	}

	public List<User> login(String email) {
		// TODO Auto-generated method stub
		return null;
	}


}
