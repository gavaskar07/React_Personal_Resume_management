package com.springboot.pms.service;
import com.springboot.pms.entity.User;

import java.util.List;
public interface UserService {
    User create(User user);
    User retrivebyid(Long userId);
    List<User> retriveall();
    User update(User user);
    void delete(Long userId);
}
