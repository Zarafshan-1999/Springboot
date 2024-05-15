package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
@Autowired
private HelloService helloService;
@Autowired
private ApiResponse apiResponse;
    @RequestMapping("/hello")
    public ApiResponse hello(){
        return helloService.hello();
    }
}
