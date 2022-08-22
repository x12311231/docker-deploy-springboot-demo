package com.example.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/simple")
    public String simple() {
        return "1";
    }

    @GetMapping("/sleep1")
    public String sleep1() throws InterruptedException {
        Thread.sleep(1000);
        return "sleep1";
    }
}
