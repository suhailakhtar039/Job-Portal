package com.example.Job_Portal.services;

import com.example.Job_Portal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

}
