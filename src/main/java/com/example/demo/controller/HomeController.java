package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
     @GetMapping("/register")
   public String ShowRegistrationForm() {
	   return "signup_form";
   }
     @GetMapping("/user_login")
  public String showLoginPage() {
	  return "user_login";
  }
}
