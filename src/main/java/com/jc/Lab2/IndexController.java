package com.jc.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model) {
        LocalTime now = LocalTime.now();

       
        String greeting;
        if (now.isBefore(LocalTime.of(12, 0))) {
            greeting = "Good morning, Jiho, Welcome to COMP367";
        } else {
            greeting = "Good afternoon, Jiho, Welcome to COMP367";
        }

        model.addAttribute("greeting", greeting); 
        return "index"; 
    }
}
