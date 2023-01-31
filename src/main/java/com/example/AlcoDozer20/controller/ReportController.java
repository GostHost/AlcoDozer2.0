package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ReportController {

    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/calendar/weekreport")
    public String weekReport (Model model){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusWeeks(1);
        Iterable<Price> price = priceRepository.findAllByDateBetweenWeek(first, second);
        model.addAttribute("price", price);
        return "week-report";
    }



}
