package com.yourdomain.controller;

import com.yourdomain.service.RegistrationRequest;
import com.yourdomain.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        try {
            return registrationService.register(request);
        }
        catch (IllegalStateException e) {
            return e.getMessage();
        }
    }
    
}
