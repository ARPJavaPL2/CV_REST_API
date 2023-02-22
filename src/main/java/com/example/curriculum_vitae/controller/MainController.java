package com.example.curriculum_vitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMain(){
        return "main";
    }
    @GetMapping("/error")
    public String getError(){
        return "error";
    }
}
