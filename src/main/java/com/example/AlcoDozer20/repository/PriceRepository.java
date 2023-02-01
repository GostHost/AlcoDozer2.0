package com.example.AlcoDozer20.repository;

import com.example.AlcoDozer20.entity.Price;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface PriceRepository extends CrudRepository<Price, Long> {
    List<Price> findAllByDateBetween (LocalDate first, LocalDate second);

}
