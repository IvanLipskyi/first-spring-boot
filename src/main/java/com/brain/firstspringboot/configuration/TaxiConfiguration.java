package com.brain.firstspringboot.configuration;

import com.brain.firstspringboot.model.Taxi;
import org.assertj.core.util.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.List;

@Configuration
public class TaxiConfiguration {

@Bean
    public List<Taxi> taxiList(){
        Taxi one = new Taxi("Lanos", "AP2020", "Tolik", DayOfWeek.MONDAY);
        Taxi two = new Taxi( "ZAZ", "AP2021", "Vasya", DayOfWeek.TUESDAY);
        Taxi three = new Taxi("Ford", "AP2022", "Petya", DayOfWeek.WEDNESDAY);
        Taxi four = new Taxi ("Volga", "AP2023", "Andrey", DayOfWeek.THURSDAY);
        Taxi five = new Taxi("Peugeot", "AP2024", "Stas", DayOfWeek.FRIDAY);
        Taxi six = new Taxi ("Nubira", "AP2025", "Ivan", DayOfWeek.SATURDAY);
        Taxi seven = new Taxi("Mazda", "AP2026", "Sergey", DayOfWeek.SUNDAY);
        return Lists.newArrayList(one, two, three, four, five, six, seven);
    }
}
