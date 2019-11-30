package com.stc21.springmvc.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("welcome_msg", "Hello form Spring MVC!!!");
        return "welcome";
    }
}
