package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.pojo.User;
import com.ecom.repository.UserInfoRepository;

@Service
public class UserInfoService {
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public User createUser(User user) {
		return userInfoRepository.save(user);
	}
	
	public Optional<User> findByUserId(long userId) {
		return userInfoRepository.findById(userId);
	}
	
	public List<User> findAllUser() {
		return 	userInfoRepository.findAll();
	}
	
	public User updateUser(User user)
	{
		return userInfoRepository.save(user);
	}
	
	public void deleteUser(long userId) {
	   userInfoRepository.deleteById(userId);
	}	
}
