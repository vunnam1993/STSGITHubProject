package com.cts.userlog;


import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cts.userlog.exceptions.UserNotFoundException;
import com.cts.userlog.services.UserServices;
import com.cts.userlog.user.User;

@RestController
public class UserController {
	@Autowired
	private UserServices userServices;
	
	@RequestMapping(path="/allUsers",method = RequestMethod.GET) 
	public List<User> getAllUsers(){
		return userServices.getUsers();
	}
	@RequestMapping(path="/users/{id}",method = RequestMethod.GET)
	public User findUser(@PathVariable int id) {
		User user= userServices.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id-"+id);
		}
		return user;
	}
	@RequestMapping(path="/users",method = RequestMethod.POST)
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
		User saveUser=userServices.saveUser(user); 
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@RequestMapping(path = "/deleteUser/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id) {
		System.out.println("id......"+id);
		User user=userServices.deleteById(id);
		
		if(user==null) {
			throw new UserNotFoundException("idd-"+id); 
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/hello")
	public String userGet() {
		return "Hellow Word";
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "hello/{name}")
	public String userDetails(@PathVariable String name) {
		return "Welcome to spring boot Application "+name;
	}
	@RequestMapping(method = RequestMethod.GET,path="hellos/{values}/value")
	public String userValues(@PathVariable String values) {
		return "Welcome to spring values "+values;
	}
	
	
	

}
