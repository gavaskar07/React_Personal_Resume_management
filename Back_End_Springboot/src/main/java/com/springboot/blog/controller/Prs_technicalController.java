package com.springboot.blog.controller;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Prs_technical;
import com.springboot.blog.service.Prs_technicalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/technical")
public class Prs_technicalController {
    private Prs_technicalService prs_technicalService;
    // build create User REST API
    @PostMapping("prs_technical")
    public ResponseEntity<Prs_technical>createtechnical(@RequestBody Prs_technical prs_technical){
        Prs_technical savedprs_technical = prs_technicalService.create(prs_technical);
        return new ResponseEntity<>(savedprs_technical, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/prs_technical/1
    @GetMapping("prs_technical/{id}")
    public ResponseEntity<Prs_technical>retrivebyidtechnical(@PathVariable("id") Long userId){
        Prs_technical prs_technical = prs_technicalService.retrivebyid(userId);
        return new ResponseEntity<>(prs_technical, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping("prs_technical")
    public ResponseEntity<List<Prs_technical>>retrivealltechnical(){
        List<Prs_technical> prs_technical = prs_technicalService.retriveall();
        return new ResponseEntity<>(prs_technical, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("prs_technical/{id}")
    // http://localhost:8080/api/prs_technical/1
    public ResponseEntity<Prs_technical>updatetechnical(@PathVariable("id") Long userId,
                                                        @RequestBody Prs_technical prs_technical){
        prs_technical.setId(userId);
        Prs_technical updatedPrs_technical = prs_technicalService.update(prs_technical);
        return new ResponseEntity<>(updatedPrs_technical, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("prs_technical/{id}")
    public ResponseEntity<String>deletetechnical(@PathVariable("id") Long userId){
        prs_technicalService.delete(userId);
        return new ResponseEntity<>("Technical details successfully deleted!", HttpStatus.OK);
    }
}
