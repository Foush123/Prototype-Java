package com.youssef_ayman.prototypedesignpattern.Models;

import com.youssef_ayman.prototypedesignpattern.Interfaces.VehiclePrototype;

public class Truck implements VehiclePrototype {
    String model;
    double cargoCapacity;

    public Truck(String model, double cargoCapacity) {
        this.model = model;
        this.cargoCapacity = cargoCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public VehiclePrototype clone() {
        return new Truck(model, cargoCapacity);
    }
}