package com.springboot.blog.service;
import com.springboot.blog.entity.Prs_coresprofobj;
import java.util.List;
public interface Prs_coresprofobjService {
    Prs_coresprofobj create(Prs_coresprofobj prs_coresprofobj);
    Prs_coresprofobj retrivebyid(Long userId);
    List<Prs_coresprofobj> retriveall();
    Prs_coresprofobj update(Prs_coresprofobj prs_coresprofobj);
    void delete(Long userId);
}
