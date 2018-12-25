package com.example.RestProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/start")
public class HomeRestController {
    @GetMapping("/start")
    public String welcomeTo() {
        return "Hello time is nohhhhhw" + LocalDateTime.now();
    }

    @GetMapping("/checkis")
    public String check() {
        return "Chek";
    }
}
