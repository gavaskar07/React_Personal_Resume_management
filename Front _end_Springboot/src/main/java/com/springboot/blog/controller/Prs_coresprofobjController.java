package com.springboot.blog.controller;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Prs_coresprofobj;
import com.springboot.blog.service.Prs_coresprofobjService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/correspondence")
public class Prs_coresprofobjController {
    private Prs_coresprofobjService prs_coresprofobjService;
    // build create User REST API
    @PostMapping("prs_coresprofobj")
    public ResponseEntity<Prs_coresprofobj>createcorrespondence(@RequestBody Prs_coresprofobj prs_coresprofobj){
        Prs_coresprofobj savedprs_coresprofobj = prs_coresprofobjService.create(prs_coresprofobj);
        return new ResponseEntity<>(savedprs_coresprofobj, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/prs_coresprofobj/1
    @GetMapping("prs_coresprofobj/{id}")
    public ResponseEntity<Prs_coresprofobj>retrivebyidcorrespondence(@PathVariable("id") Long userId){
        Prs_coresprofobj prs_coresprofobj = prs_coresprofobjService.retrivebyid(userId);
        return new ResponseEntity<>(prs_coresprofobj, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping("prs_coresprofobj")
    public ResponseEntity<List<Prs_coresprofobj>>retriveallcorrespondence(){
        List<Prs_coresprofobj> prs_coresprofobj = prs_coresprofobjService.retriveall();
        return new ResponseEntity<>(prs_coresprofobj, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("prs_coresprofobj/{id}")
    // http://localhost:8080/api/prs_coresprofobj/1
    public ResponseEntity<Prs_coresprofobj>updatecorrespondence(@PathVariable("id") Long userId,
                                                                @RequestBody Prs_coresprofobj prs_coresprofobj){
        prs_coresprofobj.setId(userId);
        Prs_coresprofobj updatedPrs_coresprofobj = prs_coresprofobjService.update(prs_coresprofobj);
        return new ResponseEntity<>(updatedPrs_coresprofobj, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("prs_coresprofobj/{id}")
    public ResponseEntity<String>deletecorrespondence(@PathVariable("id") Long userId){
        prs_coresprofobjService.delete(userId);
        return new ResponseEntity<>("Correspondence profile successfully deleted!", HttpStatus.OK);
    }
}
