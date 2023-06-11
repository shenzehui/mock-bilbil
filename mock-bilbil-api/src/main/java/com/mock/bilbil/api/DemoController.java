package com.mock.bilbil.api;

import com.mock.bilbil.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by szh on 2023-06-11
 *
 * @author szh
 */

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/getNameById/{id}")
    public String getNameById(@PathVariable Integer id) {
        return demoService.getNameById(id);
    }
}
