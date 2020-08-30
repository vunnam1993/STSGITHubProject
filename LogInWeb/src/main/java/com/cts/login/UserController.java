package com.cts.login;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	@Autowired
	private UserServices userServices;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String getDetails() {
		return "surenddra";
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String getRegistration() {
		return "register";
	}
	
	@RequestMapping(value = "/registerUser",method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user") User user) {
	userServices.saveUser(user);
		ModelAndView modelAndView=new ModelAndView("viewdetails");
		modelAndView.addObject(user);
			
			/*@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,@RequestParam("userName") String userName,
			@RequestParam("password") String password,ModelMap modelMap) {
		modelMap.put("firstName",firstName);
		modelMap.put("lastName",lastName);
		modelMap.put("userName",userName);*/
		
		return modelAndView;
	}
	@RequestMapping(value = "/allUserDetails",method = RequestMethod.GET)
	public ModelAndView getUserDdetails() {
		List<User> user=userServices.getUserDetails();
		ModelAndView modelAndView=new ModelAndView("allUserDetails");
		modelAndView.addObject("user",user);
		modelAndView.addObject(user);
		return modelAndView;
		
		
		
	}
	
}
