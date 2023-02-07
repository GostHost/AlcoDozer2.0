package com.example.AlcoDozer20.repository;

import com.example.AlcoDozer20.entity.Price;
import com.example.AlcoDozer20.entity.Volume;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface VolumeRepository extends CrudRepository<Volume, Long> {

    List<Volume> findAllByDateBetween (LocalDate first, LocalDate second);
}
