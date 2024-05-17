package com.youssef_ayman.prototypedesignpattern.Models;

import com.youssef_ayman.prototypedesignpattern.Interfaces.VehiclePrototype;

public class Car implements VehiclePrototype {
    String model;
    int seats;

    public Car(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }


    @Override
    public VehiclePrototype clone() {
        return new Car(model, seats);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
