package com.springboot.blog.service;
import com.springboot.blog.entity.Submenusetting;
import java.util.List;
public interface SubmenusettingService {
    Submenusetting create(Submenusetting submenusetting);
    Submenusetting retrivebyid(Long userId);
    List<Submenusetting> retriveall();
    Submenusetting update(Submenusetting submenusetting);
    void delete(Long userId);
}
