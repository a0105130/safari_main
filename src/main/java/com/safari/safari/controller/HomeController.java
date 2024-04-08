package com.safari.safari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("safari")
public class HomeController {
    @GetMapping("/home")
    public String safariHome() {
        return "thymeleafSafari/Home";
    }
}
