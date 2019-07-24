package com.restapi.demo.config;

import org.springframework.context.annotation.Configuration;

/* 
 * For a non-Spring Boot application, we can extend the
 * AbstractSecurityWebApplicationInitializer and pass our  
 * config class in its constructor. SecurityWebApplicationInitializer in this project
*/
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
@Component
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Inside AuthenticationManagerBuilder");
		auth.inMemoryAuthentication()
		.withUser("user").password("{noop}password").roles("USER")
		.and()
		.withUser("admin").password("{noop}password").roles("USER","ADMIN");
		
	}
	
	// Secure the end points with HTTP Basic authentication
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("Inside HttpSecurity");
		http
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/restapi/webapi/programmers").hasRole("USER")
		.antMatchers(HttpMethod.GET, "/**").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/restapi/webapi/programmers/addnew").hasRole("ADMIN")
		.and()
		.csrf().disable()
		.formLogin().disable();
		
	}

}
