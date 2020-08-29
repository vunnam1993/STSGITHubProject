package com.cts.userlog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.userlog.services.UserServices;


@Controller
public class UserLogInController {
	
	private UserServices userServices;
	
	@RequestMapping(path="/index",method = RequestMethod.GET)
	public String index() {
		System.out.println("Hello Index");
		return "Index";
	}
	

}
