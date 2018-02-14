package com.as.sample.SpringBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.sample.SpringBootApp.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;
	
	// Following method is first eg
	/*@RequestMapping("/login")
	//@ResponseBody //Directly dispacher servlet will return to browser
	public String loginMessage(@RequestParam String name, ModelMap model) {
		model.put("name",name );
		return "login";
	}*/	
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("name", "meet");
		return "welcome";
	}
	
	/*@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		if (service.validateUser(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		else {
			model.put("errorMessage", "Invalid Credential!!");
			return "login";
		}
		
	}*/
}
