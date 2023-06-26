package com.springboot.pms.service;

import com.springboot.pms.payload.LoginDto;
import com.springboot.pms.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
