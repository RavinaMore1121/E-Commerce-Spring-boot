package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.pojo.Admin;
import com.ecom.repository.AdminInfoRepository;


@Service
public class AdminInfoService {
	
	@Autowired
	private AdminInfoRepository adminInfoRepository;
	
	public Admin createAdmin(Admin admin) {
		return adminInfoRepository.save(admin);
	}
	
	public Optional<Admin> findByAdminId(long adminId) {
		return adminInfoRepository.findById(adminId);
	}
	
	public List<Admin> findAllAdmin() {
		return 	adminInfoRepository.findAll();
	}
	
	public Admin updateAdmin(Admin admin)
	{
		return adminInfoRepository.save(admin);
	}
	
	public void deleteAdmin(long adminId) {
	   adminInfoRepository.deleteById(adminId);
	}	

}
