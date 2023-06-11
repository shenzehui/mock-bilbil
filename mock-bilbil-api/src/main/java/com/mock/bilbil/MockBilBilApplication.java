package com.mock.bilbil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author szh
 */
@SpringBootApplication
@MapperScan("com.mock.bilbil.mapper")
public class MockBilBilApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockBilBilApplication.class, args);
    }

}
