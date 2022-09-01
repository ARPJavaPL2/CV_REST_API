package com.example.curriculum_vitae.repository;

import com.example.curriculum_vitae.Model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillRepository extends JpaRepository<Skill,Long> {


}
