package com.crud_operation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlTestController {
    @GetMapping("/hi")
    public String test(){
        return "navbar";
    }
    @GetMapping("/hello")
    public String test1(){
        return "doc";
    }
}
