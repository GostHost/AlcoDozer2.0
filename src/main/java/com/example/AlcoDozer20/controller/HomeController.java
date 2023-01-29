package com.example.AlcoDozer20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String start(Model model) {
//        return "redirect:/home";
        return "/start";
    }

    @GetMapping("/home")
    public String home(@RequestParam(name="title", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", name);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/calendar")
    public String calendar(Model model){
        return "calendar";
    }

}
