package com.example.Job_Portal.controller;

import com.example.Job_Portal.services.UsersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {
    private final UsersTypeService usersTypeService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

}
