package com.avizway.springdemo;  // Use your actual package name

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToSpringdemo() {
        return "redirect:/springdemo";
    }
}
