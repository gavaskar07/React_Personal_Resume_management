package com.springboot.pms.service;
import com.springboot.pms.entity.Prs_education;
import java.util.List;
public interface Prs_educationService {
    Prs_education create(Prs_education prs_education);
    Prs_education retrivebyid(Long userId);
    List<Prs_education> retriveall();
    Prs_education update(Prs_education prs_education);
    void delete(Long userId);
}
