package com.mock.bilbil;

import com.mock.bilbil.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MockBilBilApplicationTests {

    @Resource
    private DemoService demoService;

    @Test
    void contextLoads() {
        System.out.println(demoService.getNameById(1));
    }

}
