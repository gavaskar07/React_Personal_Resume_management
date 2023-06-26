package com.springboot.pms.controller;
import com.springboot.pms.entity.Menusetting;
import com.springboot.pms.payload.JWTAuthResponse;
import com.springboot.pms.payload.LoginDto;
import com.springboot.pms.payload.RegisterDto;
import com.springboot.pms.service.AuthService;
import com.springboot.pms.service.MenusettingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private AuthService authService;
    private MenusettingService menusettingService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Build Login REST API
    @PostMapping(value = {"/login", "/signin"})
    public ResponseEntity<JWTAuthResponse> login(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);

        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
        jwtAuthResponse.setAccessToken(token);

        return ResponseEntity.ok(jwtAuthResponse);
    }

    // Build Register REST API
    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping(value = {"/menusetting"})
    public ResponseEntity<Menusetting>createmenusetting(@RequestBody Menusetting menusetting){
        Menusetting savedmenusetting = menusettingService.mcreate(menusetting);
        return new ResponseEntity<>(savedmenusetting, HttpStatus.CREATED);
    }
}