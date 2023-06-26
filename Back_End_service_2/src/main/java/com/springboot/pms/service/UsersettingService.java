package com.springboot.pms.service;
import com.springboot.pms.entity.Usersetting;

import java.util.List;

public interface UsersettingService {
    Usersetting create(Usersetting usersetting);
    Usersetting retrivebyid(Long userId);
    List<Usersetting> retriveall();
    Usersetting update(Usersetting usersetting);
    void delete(Long userId);
}
