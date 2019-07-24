package com.restapi.demo.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/*
 * This class is needed only for Non Spring Boot Applications
 */
public class SecurityWebApplicationInitializer 
extends AbstractSecurityWebApplicationInitializer {

  public SecurityWebApplicationInitializer() {
      super(SpringSecurityConfig.class);
  }
}
