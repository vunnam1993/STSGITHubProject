package com.cts.login;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	static List<User> userList=new ArrayList<User>();
	
	
	public void saveUser(User user) {
		userList.add(user);		
	}
	
	public List<User> getUserDetails(){
		System.out.println(userList);
		
		return userList;
	}

}
