package com.example.curriculum_vitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {
    @GetMapping("/resume")
    public String getResume(){
        return "resumee/resume";
    }

}
