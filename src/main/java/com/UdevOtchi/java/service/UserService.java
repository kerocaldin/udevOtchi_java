package com.UdevOtchi.java.service;

import com.UdevOtchi.java.model.User;
import com.UdevOtchi.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceTest {
    @Autowired
    private UserRepository userRepository;
    public User findById(Integer id) {
        if(validationId(id)){
            return userRepository.findById(id);
        } else {
            throw new Exception("L'id n'existe pas");
        }
    }


}
