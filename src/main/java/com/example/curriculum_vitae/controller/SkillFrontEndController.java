package com.example.curriculum_vitae.controller;


import com.example.curriculum_vitae.Model.Skill;
import com.example.curriculum_vitae.Model.SkillFrontEnd;
import com.example.curriculum_vitae.service.SkillFrontEndService;
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
public class SkillFrontEndController {
    private final SkillFrontEndService skillFrontEndService;
    private final SkillService skillService;
    private List<Skill> skillsList;
    public SkillFrontEndController (SkillFrontEndService skillFrontEndService, SkillService skillService){
        this.skillFrontEndService=skillFrontEndService;
        this.skillService=skillService;
    }


    @GetMapping("/about")
    public String getFrontAbout(Model frontSkillModel,Model skillModel){
        List<SkillFrontEnd> skillFrontEndList=skillFrontEndService.getFrontSkills();
        frontSkillModel.addAttribute("frontSkills", skillFrontEndList);
        List<Skill> skillsList=skillService.getSkills();
        skillModel.addAttribute("skill", skillsList);

        return ("about/about");
    }

    @GetMapping("/addFrontSkill")
    public String getAddFrontSkill(){
        return "about/addFrontAbout";
    }

    @PostMapping("/addFrontSkill")
    public RedirectView postAddSkillFront(@ModelAttribute SkillFrontEnd skillFrontEnd){
        skillFrontEndService.addFrontSkill(skillFrontEnd);
        return  new RedirectView("/about");
    }
    @GetMapping("/editFrontSkill/{id}")
    public String getEditFrontSkill(@PathVariable("id")Long id, Model model){
        SkillFrontEnd skillFrontEnd =skillFrontEndService.getFrontEndSkillByID(id);
        model.addAttribute("skillFront", skillFrontEnd);
        return "about/editFrontAbout";
    }
    @PostMapping("/editFrontSkill/{id}")
    public RedirectView postEditSkill(@PathVariable("id") Long id, SkillFrontEnd newFrontEndSkill){
        skillFrontEndService.editFrontSkill(newFrontEndSkill);
        return new RedirectView("/about");
    }

    @PostMapping("deleteFrontSkill/{id}")
    public RedirectView postEditSkill(@PathVariable("id") Long id){
        skillFrontEndService.deleteFrontSkill(id);
        return new RedirectView("/about");
    }


}
