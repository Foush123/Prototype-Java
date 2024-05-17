package com.youssef_ayman.prototypedesignpattern.Servlets;

import com.youssef_ayman.prototypedesignpattern.Interfaces.VehiclePrototype;
import com.youssef_ayman.prototypedesignpattern.Models.Car;
import com.youssef_ayman.prototypedesignpattern.Models.Truck;
import com.youssef_ayman.prototypedesignpattern.Registries.VehicleRegistry;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/vehicles")
public class VehicleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VehiclePrototype carPrototype = VehicleRegistry.getPrototype("Car");
        VehiclePrototype truckPrototype = VehicleRegistry.getPrototype("Truck");

        Car car = (Car) carPrototype.clone();
        car.setModel("BMW X3");
        car.setSeats(4);

        Truck truck = (Truck) truckPrototype.clone();
        truck.setModel("Ford F150");
        truck.setCargoCapacity(1500.0);

        req.setAttribute("car", car);
        req.setAttribute("truck", truck);

        req.getRequestDispatcher("VehiclePage.jsp").forward(req, resp);
    }
}
