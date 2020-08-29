package com.cts.UserLonInController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogInController {
	@RequestMapping(path="/index",method = RequestMethod.GET)
	public String index() {
		System.out.println("Hello Index");
		return "Index";
	}

}
