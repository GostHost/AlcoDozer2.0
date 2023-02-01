package com.example.AlcoDozer20.controller;


import com.example.AlcoDozer20.entity.Volume;
import com.example.AlcoDozer20.repository.VolumeRepository;
import com.example.AlcoDozer20.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VolumeController {

    @Autowired
    VolumeRepository volumeRepository;

    @Autowired
    VolumeService volumeService;

    @GetMapping("/calendar/volume")
    public String volume (Model model){
        Iterable<Volume> volumes = volumeRepository.findAll();
        model.addAttribute("volumes", volumes);
        return "volume";
    }

    @GetMapping("/volume/add")
    public String volumeAdd (Model model){
        return "add-volumes";
    }

    @PostMapping("/volume/add")
    public String VolumeAddPost (@RequestParam String name, @RequestParam double volume, @RequestParam double strength, Model model){
        Volume volumePost = new Volume(name, volume, strength);
        volumeRepository.save(volumePost);
        return "redirect:/calendar/volume";
    }


}
