package com.nickt.simpleservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String helloWorld() {
        return "Hello World! now()=" + new Date().toLocaleString();
    }

}