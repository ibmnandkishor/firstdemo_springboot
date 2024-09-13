package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "admin_login";
    }

    @PostMapping("/admin_login")
    public String adminLogin(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             HttpSession session,
                             Model model) {
        // Replace this with your actual admin credentials
        String adminUsername = "admin";
        String adminPassword = "password";

        if (adminUsername.equals(username) && adminPassword.equals(password)) {
           
            return "adminpage";
        } else {
            
            return "admin_login";
        }
    }

   

}
