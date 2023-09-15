package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.Models.User;
import com.scaler.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User createUser(User user){
        System.out.println("Got service request for "+ user.getEmail()+" with pwd: "+ user.getPassword());
        return userRepository.save(user);
    }

    public User getUserInternal(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
