package com.homeutil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReminderController {

    @GetMapping("/rest")
    public String rest() {
        return "rest documentation";
    }

    @GetMapping("/unit-test-best-practice")
    public String unitTestBestPractice() {
        return "unit test best practice";
    }
}
