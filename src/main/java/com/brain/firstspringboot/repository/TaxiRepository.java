package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class TaxiRepository {

    @Autowired
    List<Taxi> taxiList;
    public Taxi getFreeTaxi(){
        return taxiList.stream().filter(taxiList -> !taxiList.getRestDay().equals(LocalDate.now().getDayOfWeek())).findFirst().orElseThrow((()->new RuntimeException("...")));
    }
}
