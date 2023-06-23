package com.springboot.blog.service;
import com.springboot.blog.entity.Prs_project;
import java.util.List;
public interface Prs_projectService {
    Prs_project create(Prs_project prs_project);
    Prs_project retrivebyid(Long userId);
    List<Prs_project> retriveall();
    Prs_project update(Prs_project prs_project);
    void delete(Long userId);
}
