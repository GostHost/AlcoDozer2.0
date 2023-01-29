package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Drink;
import com.example.AlcoDozer20.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping("/drink")
    public String drink (Model model){
        Iterable<Drink> drinks =drinkRepository.findAll();
        model.addAttribute("drinks", drinks);
        return "drink";
    }

    @GetMapping("/drink/add")
    public String drinkAdd (Model model){
        return "add-drinks";
    }

    @PostMapping("/drink/add")
    public String drinkAddPost (@RequestParam String name, @RequestParam String strength, Model model){
        Drink drink = new Drink(name, strength);
        drinkRepository.save(drink);
        return "redirect:/drink";
    }


}
