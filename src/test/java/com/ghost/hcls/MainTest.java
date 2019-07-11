package com.ghost.hcls;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MainTest {
    @Test
    public void contextLoads() {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
