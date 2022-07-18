package com.example.springsecurity.util;


import com.example.springsecurity.entity.Account;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class testGenerate {
    @Test
    public void testGenerateToken(){
        Account account = Account.builder()
                .id(System.currentTimeMillis())
                .role(1)
                .username("viethoang")
                .passwordHash("xyz")
                .build();
        String accessToken = JwtUtil.generateTokenByAccount(account, 15 * 24 * 60 * 60 * 1000);
        System.out.println(accessToken);
    }
}