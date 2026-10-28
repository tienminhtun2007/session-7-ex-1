package com.example.myspringbootprojectsession7.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Integer age;

    @Column(name = "years_of_experience", nullable = false)
    private Integer yearsOfExperience;

    protected Candidate() {
    }

    public Candidate(String fullName, String email, Integer age, Integer yearsOfExperience) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }
}
