package com.joy.membership.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.joy.membership.model.User;
import com.joy.membership.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
