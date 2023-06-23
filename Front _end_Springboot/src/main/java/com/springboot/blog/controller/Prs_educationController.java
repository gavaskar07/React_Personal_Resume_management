package com.springboot.blog.controller;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Prs_education;
import com.springboot.blog.service.Prs_educationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/education")
public class Prs_educationController {
    private Prs_educationService prs_educationService;
    // build create User REST API

    @PostMapping("prs_education")
    public ResponseEntity<Prs_education>createeducation(@RequestBody Prs_education prs_education){
        Prs_education savedprs_education = prs_educationService.create(prs_education);
        return new ResponseEntity<>(savedprs_education, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/prs_education/1
    @GetMapping("prs_education/{id}")
    public ResponseEntity<Prs_education>retrivebyideducation(@PathVariable("id") Long userId){
        Prs_education prs_education = prs_educationService.retrivebyid(userId);
        return new ResponseEntity<>(prs_education, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping("prs_education")
    public ResponseEntity<List<Prs_education>>retrivealeducation(){
        List<Prs_education> prs_education = prs_educationService.retriveall();
        return new ResponseEntity<>(prs_education, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("prs_education/{id}")
    // http://localhost:8080/api/prs_education/1
    public ResponseEntity<Prs_education>updateeducation(@PathVariable("id") Long userId,
                                                        @RequestBody Prs_education prs_education){
        prs_education.setId(userId);
        Prs_education updatedPrs_education = prs_educationService.update(prs_education);
        return new ResponseEntity<>(updatedPrs_education, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("prs_education/{id}")
    public ResponseEntity<String>deleteeducation(@PathVariable("id") Long userId){
        prs_educationService.delete(userId);
        return new ResponseEntity<>("Education profile successfully deleted!", HttpStatus.OK);
    }

}
