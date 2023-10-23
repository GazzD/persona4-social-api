package com.vcardozof.persona4socialapi.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello-world")
public class HelloWorldControllerImpl {

    @GetMapping("")
    public String helloWorld() {
        return "Hello aaaaa!";
    }
}
