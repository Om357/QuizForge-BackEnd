package com.quizforge.backend.service;

import com.quizforge.backend.model.User;
import com.quizforge.backend.model.UserRole;

import java.util.Set;


public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    public User getUser(String username);

    public void deleteUser(Long userId);

    public User getUserByEmail(String email);
}
