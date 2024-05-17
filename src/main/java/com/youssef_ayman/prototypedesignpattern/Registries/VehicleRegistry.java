package com.youssef_ayman.prototypedesignpattern.Registries;

import com.youssef_ayman.prototypedesignpattern.Interfaces.VehiclePrototype;
import com.youssef_ayman.prototypedesignpattern.Models.Car;
import com.youssef_ayman.prototypedesignpattern.Models.Truck;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, VehiclePrototype> prototypes = new HashMap<>();

    static {
        prototypes.put("Car", new Car("Toyota Corolla", 5));
        prototypes.put("Truck", new Truck("Dodge ram", 1000.0));
    }

    public static VehiclePrototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}