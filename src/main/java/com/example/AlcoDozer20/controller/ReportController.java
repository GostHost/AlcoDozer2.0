package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.repository.PriceRepository;
import com.example.AlcoDozer20.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ReportController {

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    PriceService priceService;


    @GetMapping("/weekreport")
    public Iterable<Price> week(Model model){
        Iterable<Price> price = priceService.getWeekDate();
        List<Price> p2 = priceRepository.findAll();
        double prices = priceService.getSumPrice(p2);
        model.addAttribute("price", price);
        model.addAttribute("prices", prices);
        return price;
    }


    @PostMapping("/weekreport")
    @ResponseBody
    public Iterable<Price> postWeekReport(){
        Iterable<Price> schedule = priceService.getWeekDate();
        return schedule;
    }

    @GetMapping("/monthreport")
    public Iterable<Price> month(Model model){
        Iterable<Price> price = priceService.getMonthDate();
        model.addAttribute("price", price);
        return price;
    }


    @PostMapping("/monthreport")
    @ResponseBody
    public Iterable<Price> postMonthReport(){
        Iterable<Price> schedule = priceService.getMonthDate();
        return schedule;
    }

    @GetMapping("/quartreport")
    public Iterable<Price> quart(Model model){
        Iterable<Price> price = priceService.getQuartDate();
        model.addAttribute("price", price);
        return price;
    }


    @PostMapping("/quartreport")
    @ResponseBody
    public Iterable<Price> postQuartReport(){
        Iterable<Price> schedule = priceService.getQuartDate();
        return schedule;
    }

    @GetMapping("/yearreport")
    public Iterable<Price> year(Model model){
        Iterable<Price> price = priceService.getYearDate();
        model.addAttribute("price", price);
        return price;
    }


    @PostMapping("/yearreport")
    @ResponseBody
    public Iterable<Price> postYearReport(){
        Iterable<Price> schedule = priceService.getYearDate();
        return schedule;
    }



}
