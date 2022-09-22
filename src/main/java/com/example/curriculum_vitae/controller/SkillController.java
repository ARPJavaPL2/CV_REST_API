package com.example.curriculum_vitae.controller;

import com.example.curriculum_vitae.Model.Skill;
import com.example.curriculum_vitae.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller

public class SkillController {
private final SkillService skillService;
public SkillController(SkillService skillService){
    this.skillService=skillService;
}


    @GetMapping("/frontabout")
    public String getAbout (Model model,Model frontModel){
        List<Skill> skillsList=skillService.getSkills();
        model.addAttribute("skill", skillsList);
        return ("about/about");
    }

    
    @GetMapping("/addSkill")
    public String getAddSkill(){
    return "about/addAbout";
    }

    @PostMapping("/addSkill")
    public RedirectView postAddSkill(@ModelAttribute Skill skill){
    skillService.addSkill(skill);
    return  new RedirectView("/about");
    }
    @GetMapping("/editSkill/{id}")
    public String getEditSkill(@PathVariable("id")Long id, Model model){
    Skill skill =skillService.getSkillById(id);
    model.addAttribute("skill", skill);
    return "about/editAbout";
    }
    @PostMapping("/editSkill/{id}")
    public RedirectView postEditSkill(@PathVariable("id") Long id, Skill newSkill){
    skillService.editSkill(newSkill);
    return new RedirectView("/about");
    }

    @PostMapping("deleteSkill/{id}")
    public RedirectView postEditSkill(@PathVariable("id") Long id){
    skillService.deleteSkill(id);
    return new RedirectView("/about");
    }




}
