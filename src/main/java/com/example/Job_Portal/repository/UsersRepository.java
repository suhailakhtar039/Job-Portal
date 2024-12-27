package com.example.Job_Portal.repository;

import com.example.Job_Portal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
