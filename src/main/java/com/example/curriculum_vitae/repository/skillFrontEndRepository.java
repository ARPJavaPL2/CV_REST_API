package com.example.curriculum_vitae.repository;


import com.example.curriculum_vitae.Model.SkillFrontEnd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillFrontEndRepository extends JpaRepository<SkillFrontEnd,Long> {
}
