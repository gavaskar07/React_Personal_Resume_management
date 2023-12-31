package com.springboot.pms.controller;
import com.springboot.pms.entity.Prs_technical;
import com.springboot.pms.service.Prs_technicalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("prs_technical")
public class Prs_technicalController {
    private Prs_technicalService prs_technicalService;
    // build create User REST API
    @PostMapping
    public ResponseEntity<Prs_technical>create(@RequestBody Prs_technical prs_technical){
        Prs_technical savedprs_technical = prs_technicalService.create(prs_technical);
        return new ResponseEntity<>(savedprs_technical, HttpStatus.CREATED);
    }

    // build get user by id REST API

    @GetMapping("{id}")
    public ResponseEntity<Prs_technical>retrivebyid(@PathVariable("id") Long userId){
        Prs_technical prs_technical = prs_technicalService.retrivebyid(userId);
        return new ResponseEntity<>(prs_technical, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<Prs_technical>>retriveall(){
        List<Prs_technical> prs_technical = prs_technicalService.retriveall();
        return new ResponseEntity<>(prs_technical, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")

    public ResponseEntity<Prs_technical>update(@PathVariable("id") Long userId,
                                                @RequestBody Prs_technical prs_technical){
        prs_technical.setId(userId);
        Prs_technical updatedPrs_technical = prs_technicalService.update(prs_technical);
        return new ResponseEntity<>(updatedPrs_technical, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String>delete(@PathVariable("id") Long userId){
        prs_technicalService.delete(userId);
        return new ResponseEntity<>("Technical details successfully deleted!", HttpStatus.OK);
    }
}
