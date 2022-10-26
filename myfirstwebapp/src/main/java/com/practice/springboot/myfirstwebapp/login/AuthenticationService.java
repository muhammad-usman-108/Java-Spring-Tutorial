package com.practice.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("usmanmuh");
		boolean isValidPassword = password.equalsIgnoreCase("test");
		return isValidUserName & isValidPassword;
	}
}
