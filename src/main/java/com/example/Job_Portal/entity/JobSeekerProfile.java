package com.example.Job_Portal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "job_seeker_profile")
public class JobSeekerProfile {
    @Id
    private int userAccountId;

    @OneToOne
    @JoinColumn(name = "user_account_id")
    @MapsId
    private Users users;

    private String city;

    private String country;

    private String employmentType;

    private String firstName;

    private String lastName;

    private String profilePhoto;

    private String resume;

    private String state;

    private String workAuthorization;
}
