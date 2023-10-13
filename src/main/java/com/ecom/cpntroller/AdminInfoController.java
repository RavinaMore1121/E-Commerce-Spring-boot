package com.ecom.cpntroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.pojo.Admin;
import com.ecom.service.AdminInfoService;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/adminController")
public class AdminInfoController {

	@Autowired
	private AdminInfoService adminInfoService;
	
	 @PostMapping("/create" )
	    public Admin create(@RequestBody Admin admin)
	    {
	        return  adminInfoService.createAdmin(admin);
	    }

	    @GetMapping("/byId/{adminId}")
	    public Optional<Admin> byId(@PathVariable("adminId") long adminId)
	    {
	        return adminInfoService.findByAdminId(adminId);
	    }

	    @PutMapping("/update")
	    public Admin updateById(@RequestBody Admin admin)
	    {
	        return adminInfoService.updateAdmin(admin);
	    }

	    @DeleteMapping("/deleteById/{adminId}")
	    public void deleteById(@PathVariable("adminId") long adminId)
	    {
	         adminInfoService.deleteAdmin(adminId);
	    }

	
}
