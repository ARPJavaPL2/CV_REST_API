package com.example.curriculum_vitae.repository;

import com.example.curriculum_vitae.Model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface resumeRepository  extends JpaRepository<Resume,Long> {
}
