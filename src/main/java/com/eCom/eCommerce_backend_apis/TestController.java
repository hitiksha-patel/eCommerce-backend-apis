package com.eCom.eCommerce_backend_apis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")

    public String test(){
        return "test";
    }
}
