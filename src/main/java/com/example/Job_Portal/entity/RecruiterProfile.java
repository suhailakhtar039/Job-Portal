package com.example.Job_Portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recruiter_profile")
public class RecruiterProfile {

    private int userAccountId;

    private String city;

    private String company;

    private String country;

    private String firstName;

    private String lastName;

    private String profilePhoto;

    private String state;

}
