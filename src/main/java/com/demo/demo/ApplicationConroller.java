package com.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationConroller {

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/index2")
    public String widget(){
        return "index2";
    }
}
