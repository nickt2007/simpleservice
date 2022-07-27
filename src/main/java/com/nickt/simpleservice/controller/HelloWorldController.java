package com.nickt.simpleservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String helloWorld() throws UnknownHostException {
        return "Hello World!("+ InetAddress.getLocalHost().getHostAddress()+") now(V2)=" + new Date().toLocaleString();
    }

}