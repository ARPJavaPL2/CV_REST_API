package com.example.curriculum_vitae.service;

import com.example.curriculum_vitae.Model.Skill;
import com.example.curriculum_vitae.repository.skillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    private final skillRepository skillRepository;

    public SkillService(skillRepository skillRepository){
        this.skillRepository= skillRepository;
    }

    public List<Skill> getSkills() {
        return skillRepository.findAll();
    }

    public void addSkill(Skill skill){
        skillRepository.save(skill);
    }

    public Skill getSkillById (Long id){
        return skillRepository.findById(id).orElse(null);
    }
    public void editSkill (Skill skill){
        skillRepository.save(skill);
    }

    public void deleteSkill(Long id){skillRepository.deleteById(id);}

}
