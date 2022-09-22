package com.example.curriculum_vitae.service;




import com.example.curriculum_vitae.Model.SkillFrontEnd;
import com.example.curriculum_vitae.repository.skillFrontEndRepository;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillFrontEndService {
    private final skillFrontEndRepository skillFrontEndRepository;

    public SkillFrontEndService(skillFrontEndRepository skillFrontEndRepository) {
        this.skillFrontEndRepository = skillFrontEndRepository;
    }
    public List<SkillFrontEnd> getFrontSkills(){return skillFrontEndRepository.findAll();}
    public void addFrontSkill(SkillFrontEnd skillFrontEnd){
        skillFrontEndRepository.save(skillFrontEnd);
        System.out.println("added new frontskill: "+skillFrontEnd.getId());
    }
    public SkillFrontEnd getFrontEndSkillByID(Long id){return skillFrontEndRepository.findById(id).orElse(null);}
    public void editFrontSkill(SkillFrontEnd skillFrontEnd){skillFrontEndRepository.save(skillFrontEnd);}
    public void deleteFrontSkill(Long id){skillFrontEndRepository.deleteById(id);}


}
