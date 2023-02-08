package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/")
    public String start(Model model) {
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
    public Iterable<Price> calendar(Model model){
        Iterable<Price> price = priceRepository.findAll();
        model.addAttribute("price", price);
        return price;
    }

    @PostMapping("/calendar")
    @ResponseBody
    public Iterable<Price> postTest(){
        Iterable<Price> schedule = priceRepository.findAll();
        return schedule;
    }

    @GetMapping("/memo")
    public String memo(){
        return "memo";
    }
}






