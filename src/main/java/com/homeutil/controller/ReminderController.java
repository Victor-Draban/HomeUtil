package com.homeutil.controller;

import com.homeutil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReminderController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/rest")
    public String rest() {
        return "rest documentation";
    }

    @GetMapping("/unit-test-best-practice")
    public String unitTestBestPractice() {
        return "unit test best practice";
    }
}
