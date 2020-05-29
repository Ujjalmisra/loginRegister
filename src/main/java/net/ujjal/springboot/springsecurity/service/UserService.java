package net.ujjal.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.ujjal.springboot.springsecurity.model.User;
import net.ujjal.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
