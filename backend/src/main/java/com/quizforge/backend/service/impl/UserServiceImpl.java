package com.quizforge.backend.service.impl;

import com.quizforge.backend.model.User;
import com.quizforge.backend.model.UserRole;
import com.quizforge.backend.repository.RoleRepository;
import com.quizforge.backend.repository.UserRepository;
import com.quizforge.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
       User local =  this.userRepository.findByUsername(user.getUsername());
       if(local!=null){
           System.out.println("User Already exists with username - " + user.getUsername());
           throw new Exception("User Already exists with username - "+ user.getUsername());
       }else{
            for(UserRole role:userRoles){
                roleRepository.save(role.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
       }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
