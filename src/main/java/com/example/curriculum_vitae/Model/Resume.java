package com.example.curriculum_vitae.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employerName;
    private String educatedIn;
    private String shortAbout;
    private String dateFromTo;


    private String nameLastName;
    private String adress;
    private String phone;
    private String email;
    private String shortNote;

    }

