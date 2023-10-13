package com.ecom.cpntroller;
import java.util.List;
import java.util.Optional;

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

import com.ecom.pojo.User;
import com.ecom.service.UserInfoService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/userController")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	
	 @PostMapping("/create" )
	    public User create(@RequestBody User user)
	    {
	        return  userInfoService.createUser(user);
	    }

	    @GetMapping("/byId/{userId}")
	    public Optional<User> byId(@PathVariable("userId") long userId)
	    {
	        return userInfoService.findByUserId(userId);
	    }

	    @PutMapping("/update")
	    public User updateById(@RequestBody User user)
	    {
	        return userInfoService.updateUser(user);
	    }

	    @DeleteMapping("/deleteById/{userId}")
	    public void deleteById(@PathVariable("userId") long userId)
	    {
	         userInfoService.deleteUser(userId);
	    }
}
