package com.springboot.pms.service.impl;
import com.springboot.pms.entity.User;
import com.springboot.pms.repository.UserRepository;
import lombok.AllArgsConstructor;
import com.springboot.pms.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public User create(User user) {
        return userRepository.save(user);
    }


    public User retrivebyid(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    public List<User> retriveall() {
        return userRepository.findAll();
    }
    public User update(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}
