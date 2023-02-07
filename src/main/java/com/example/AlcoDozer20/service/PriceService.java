package com.example.AlcoDozer20.service;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private PriceService priceService;

    public List<Price> getWeekDate (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusWeeks(1);
        List<Price> weekPriceList = priceRepository.findAllByDateBetween(first, second);
        return weekPriceList;
    }

    public List<Price> getMonthDate (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusMonths(1);
        List<Price> monthPriceList = priceRepository.findAllByDateBetween(first, second);
        return monthPriceList;
    }

    public List<Price> getQuartDate (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusMonths(3);
        List<Price> quartPriceList = priceRepository.findAllByDateBetween(first, second);
        return quartPriceList;
    }

    public List<Price> getYearDate (){
        LocalDate second = LocalDate.now();
        LocalDate first = second.minusYears(1);
        List<Price> yearPriceList = priceRepository.findAllByDateBetween(first, second);
        return yearPriceList;
    }
}
