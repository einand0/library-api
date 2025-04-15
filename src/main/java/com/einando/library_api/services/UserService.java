package com.einando.library_api.services;

import com.einando.library_api.entities.Loan;
import com.einando.library_api.entities.User;
import com.einando.library_api.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
}
