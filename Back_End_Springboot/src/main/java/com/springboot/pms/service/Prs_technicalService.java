package com.springboot.pms.service;
import com.springboot.pms.entity.Prs_technical;
import java.util.List;
public interface Prs_technicalService {
    Prs_technical create(Prs_technical prs_technical);
    Prs_technical retrivebyid(Long userId);
    List<Prs_technical> retriveall();
    Prs_technical update(Prs_technical prs_education);
    void delete(Long userId);
}
