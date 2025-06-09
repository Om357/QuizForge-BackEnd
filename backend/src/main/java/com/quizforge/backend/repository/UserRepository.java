package com.quizforge.backend.repository;

import com.quizforge.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);

    public User findByEmail(String email);
}
