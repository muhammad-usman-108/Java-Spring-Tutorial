package com.practice.springboot.myfirstwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	//LDAP or database
	// In Memory
	
	@Bean 
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails = User.withDefaultPasswordEncoder()
		.username("usmanmuh")
		.password("test")
		.roles("USER", "ADMIN")
		.build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
}
