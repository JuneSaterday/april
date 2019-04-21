package com.zhangwei.april.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String message){

        return "welcome to " + message;
    }
}
