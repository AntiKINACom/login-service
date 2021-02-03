package com.yourdomain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/password")
public class PasswordResetController {

    @PostMapping("/request")
    public String resetPassword() {
        return "";
    }

    @GetMapping("/change")
    public ModelAndView changePassword2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("change");
        return modelAndView;
    }
}
