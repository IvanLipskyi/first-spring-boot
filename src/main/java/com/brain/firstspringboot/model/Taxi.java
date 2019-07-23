package com.brain.firstspringboot.model;

import java.time.DayOfWeek;

public class Taxi {
    private String car;
    private String carNumber;
    private String driverName;
    private DayOfWeek restDay;

    public DayOfWeek getRestDay() {
        return restDay;
    }

    public void setRestDay(DayOfWeek restDay) {
        this.restDay = restDay;
    }

    public Taxi(String car, String carNumber, String driverName, DayOfWeek restDay) {
        this.car = car;
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.restDay = restDay;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "car='" + car + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", restDay=" + restDay +
                '}';
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
