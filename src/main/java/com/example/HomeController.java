package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/")
    public String hello() {
    System.out.println("Hello function!!!");

        return "index"; // index: view 이름
    }
}
