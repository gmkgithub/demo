package com.gmk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @ResponseBody
    @RequestMapping("/nihao")
    public String hello(){
        return  "nihao springboot2";

    }
}
