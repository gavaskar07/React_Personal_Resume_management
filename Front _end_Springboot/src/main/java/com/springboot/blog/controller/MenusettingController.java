
package com.springboot.blog.controller;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Menusetting;
import com.springboot.blog.service.MenusettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/menu")
public class MenusettingController {
    private MenusettingService menusettingService;
    // build create User REST API]
    @PostMapping("menusetting")
    public ResponseEntity<Menusetting>createmenusetting(@RequestBody Menusetting menusetting){
        Menusetting savedmenusetting = menusettingService.mcreate(menusetting);
        return new ResponseEntity<>(savedmenusetting, HttpStatus.CREATED);
    }
    // build get user by id REST API

    @GetMapping("menusetting/{id}")
    public ResponseEntity<Menusetting> retrivebyidmenusetting(@PathVariable("id") Long userId){
        Menusetting menusetting = menusettingService.mretrivebyid(userId);
        return new ResponseEntity<>(menusetting, HttpStatus.OK);
    }
    // Build Get All Users REST API

    @GetMapping("menusetting")
    public ResponseEntity<List<Menusetting>>retriveallmenusetting(){
        List<Menusetting> menusetting = menusettingService.mretriveall();
        return new ResponseEntity<>(menusetting, HttpStatus.OK);
    }

    // Build Update User REST API

    @PutMapping("menusetting/{id}")

    public ResponseEntity<Menusetting>updatemenusetting(@PathVariable("id") Long userId,
                                                        @RequestBody Menusetting menusetting){
        menusetting.setId(userId);
        Menusetting updatedMenusetting = menusettingService.mupdate(menusetting);
        return new ResponseEntity<>(updatedMenusetting, HttpStatus.OK);
    }
    // Build Delete User REST API

    @DeleteMapping("menusetting/{id}")
    public ResponseEntity<String>deletemenuseting(@PathVariable("id") Long userId){
        menusettingService.mdelete(userId);
        return new ResponseEntity<>("Menu  successfully deleted!", HttpStatus.OK);
    }
}

