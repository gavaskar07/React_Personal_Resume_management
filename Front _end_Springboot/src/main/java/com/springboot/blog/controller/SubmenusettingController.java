
package com.springboot.blog.controller;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Submenusetting;
import com.springboot.blog.service.SubmenusettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/submenu")
public class SubmenusettingController {
    private SubmenusettingService submenusettingService;
    // build create User REST API
    @PostMapping("submenusetting")
    public ResponseEntity<Submenusetting>createsubmenu(@RequestBody Submenusetting submenusetting){
        Submenusetting savedsubmenusetting = submenusettingService.create(submenusetting);
        return new ResponseEntity<>(savedsubmenusetting, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/submenu-setting/1
    @GetMapping("submenusetting/{id}")
    public ResponseEntity<Submenusetting>retrivebyidsubmenu(@PathVariable("id") Long userId){
        Submenusetting submenusetting = submenusettingService.retrivebyid(userId);
        return new ResponseEntity<>(submenusetting, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping("submenusetting")
    public ResponseEntity<List<Submenusetting>>retriveallsubmenu(){
        List<Submenusetting> submenusetting = submenusettingService.retriveall();
        return new ResponseEntity<>(submenusetting, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("submenusetting/{id}")
    // http://localhost:8080/api/submenu-setting/1
    public ResponseEntity<Submenusetting>updatesubmenu(@PathVariable("id") Long userId,
                                                       @RequestBody Submenusetting submenusetting){
        submenusetting.setId(userId);
        Submenusetting updatedSubmenusetting = submenusettingService.update(submenusetting);
        return new ResponseEntity<>(updatedSubmenusetting, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("submenusetting/{id}")
    public ResponseEntity<String>deletesubmenu(@PathVariable("id") Long userId){
        submenusettingService.delete(userId);
        return new ResponseEntity<>("Sub menu successfully deleted!", HttpStatus.OK);
    }
}
