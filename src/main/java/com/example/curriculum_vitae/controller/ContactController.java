package com.example.curriculum_vitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String getMain(){
        return "contact/contact";
    }
}
