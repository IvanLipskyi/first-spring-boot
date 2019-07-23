
package com.brain.firstspringboot.service;

import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaxiCaller {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TaxiRepository taxiRepository;

    public void call (String person){
    Taxi car = taxiRepository.getFreeTaxi();
        System.out.println("Car: " + car);
        System.out.println("Call taxi for a " + person);
    }
}
