package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class PriceController {

    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/price")
    public String price (Model model){
        Iterable<Price> price = priceRepository.findAll();
        model.addAttribute("price", price);
        return "price";
    }

    @GetMapping("/price/add")
    public String priceAdd (Model model){
        return "add-price";
    }

    @PostMapping("/price/add")
    public String priceAddPost (@RequestParam String name, @RequestParam double price, Model model){
        Price prices = new Price(name, price);
        priceRepository.save(prices);
        return "redirect:/price";
    }

}
