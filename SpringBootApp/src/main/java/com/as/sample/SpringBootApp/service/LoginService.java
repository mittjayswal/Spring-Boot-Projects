package com.as.sample.SpringBootApp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userName, String password) {
		return (userName.equalsIgnoreCase("meet") && password.equalsIgnoreCase("meet"));
	}
}
