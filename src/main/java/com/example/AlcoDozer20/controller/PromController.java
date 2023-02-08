package com.example.AlcoDozer20.controller;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.entity.Volume;
import com.example.AlcoDozer20.repository.PriceRepository;
import com.example.AlcoDozer20.repository.VolumeRepository;
import com.example.AlcoDozer20.service.PriceService;
import com.example.AlcoDozer20.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PromController {

    @Autowired
    VolumeRepository volumeRepository;

    @Autowired
    VolumeService volumeService;

    @GetMapping("/promille")
    public Iterable<Volume> prommile(Model model){
        Iterable<Volume> volume = volumeRepository.findAll();
        model.addAttribute("volume", volume);
        return volume;
    }


    @PostMapping("/promille")
    @ResponseBody
    public Iterable<Volume> postPromille(){
        Iterable<Volume> schedule = volumeRepository.findAll();
        return schedule;
    }

    @GetMapping("/weekprom")
    public Iterable<Volume> weekProm(Model model){
        Iterable<Volume> volume = volumeService.getWeekProm();
        double volumes = volumeService.getSumVolume(volume);
        model.addAttribute("volumes", volumes);
        model.addAttribute("volume", volume);
        return volume;
    }


    @PostMapping("/weekprom")
    @ResponseBody
    public Iterable<Volume> postWeekProm(){
        Iterable<Volume> schedule = volumeService.getWeekProm();
        return schedule;
    }

    @GetMapping("/monthprom")
    public Iterable<Volume> monthProm(Model model){
        Iterable<Volume> volume = volumeService.getMonthProm();
        double volumes = volumeService.getSumVolume(volume);
        model.addAttribute("volumes", volumes);
        model.addAttribute("volume", volume);
        return volume;
    }


    @PostMapping("/monthprom")
    @ResponseBody
    public Iterable<Volume> postMonthProm(){
        Iterable<Volume> schedule = volumeService.getMonthProm();
        return schedule;
    }

    @GetMapping("/quartprom")
    public Iterable<Volume> quartProm(Model model){
        Iterable<Volume> volume = volumeService.getQuartProm();
        double volumes = volumeService.getSumVolume(volume);
        model.addAttribute("volumes", volumes);
        model.addAttribute("volume", volume);
        return volume;
    }


    @PostMapping("/quartprom")
    @ResponseBody
    public Iterable<Volume> postQuartProm(){
        Iterable<Volume> schedule = volumeService.getQuartProm();
        return schedule;
    }

    @GetMapping("/yearprom")
    public Iterable<Volume> yearProm(Model model){
        Iterable<Volume> volume = volumeService.getYearProm();
        double volumes = volumeService.getSumVolume(volume);
        model.addAttribute("volumes", volumes);
        model.addAttribute("volume", volume);
        return volume;
    }


    @PostMapping("/yearprom")
    @ResponseBody
    public Iterable<Volume> postYearProm(){
        Iterable<Volume> schedule = volumeService.getYearProm();
        return schedule;
    }

}
