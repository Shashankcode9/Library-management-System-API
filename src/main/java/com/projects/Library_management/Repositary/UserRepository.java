package com.projects.Library_management.Repositary;

import com.projects.Library_management.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}