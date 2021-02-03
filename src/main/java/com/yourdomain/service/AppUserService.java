package com.yourdomain.service;

import com.yourdomain.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public interface AppUserService extends UserDetailsService {
    String signUpUser(AppUser appUser);
}
