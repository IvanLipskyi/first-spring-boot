package com.brain.firstspringboot.component;

import com.brain.firstspringboot.service.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private TaxiCaller taxiCaller;

    @Value("${user.properties.person.name}")
    private String name;

    @Value("${user.properties.person.phone}")
    private String phone;

    public void goTaxi(){
        taxiCaller.call(name);
    }
}
