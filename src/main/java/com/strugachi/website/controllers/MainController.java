package com.strugachi.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping()
    public String index(){
        return "index";
    }

    @GetMapping("/plants")
    public String fabricks(){
        return "fabricks";
    }
    @GetMapping("/legacy")
    public String legacy(){
        return "legacy";
    }
    @GetMapping("/children")
    public String children(){
        return "children";
    }
}
