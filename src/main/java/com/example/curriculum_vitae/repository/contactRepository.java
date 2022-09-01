package com.example.curriculum_vitae.repository;


import com.example.curriculum_vitae.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactRepository extends JpaRepository<Contact,Long> {
}
