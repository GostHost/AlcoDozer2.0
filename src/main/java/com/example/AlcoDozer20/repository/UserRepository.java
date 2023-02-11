package com.example.AlcoDozer20.repository;

import com.example.AlcoDozer20.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
