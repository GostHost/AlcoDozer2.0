package com.example.AlcoDozer20.service;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.entity.Volume;
import com.example.AlcoDozer20.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VolumeService {

    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private VolumeService volumeService;

    public List<Volume> getWeekProm (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusWeeks(1);
        List<Volume> weekPromList = volumeRepository.findAllByDateBetween(first, second);
        return weekPromList;
    }

    public List<Volume> getMonthProm (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusMonths(1);
        List<Volume> monthPromList = volumeRepository.findAllByDateBetween(first, second);
        return monthPromList;
    }

    public List<Volume> getQuartProm (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusMonths(3);
        List<Volume> quartPromList = volumeRepository.findAllByDateBetween(first, second);
        return quartPromList;
    }

    public List<Volume> getYearProm (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusYears(1);
        List<Volume> yearPromList = volumeRepository.findAllByDateBetween(first, second);
        return yearPromList;
    }

}
