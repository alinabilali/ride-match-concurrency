package com.alina.ridematch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // create a rider
        Rider rider = new Rider("Alina", 2.94735, 5.8632);

        // create a list of drivers (mix of available/unavailable)
        List<Driver> drivers = List.of(
                new Driver("Azam", 7.8362, 9.8363, false),
                new Driver("Sarah", 10.8500, 3.8400, true),
                new Driver("Ali", 4.4931, 9.8560, false),
                new Driver("Jason", 2.3253, 1.8400, true),
                new Driver("Peter", 6.8500, 0.8450, true)
                );
        // call findNearestDriver
        Optional<Driver> nearestDriver = DriverFinder.findNearestDriver(rider, drivers);

        // check if present, print the driver's name if so, otherwise print "no driver available"
        if(nearestDriver.isPresent()) {
            Driver driver = nearestDriver.get();
            System.out.println("Nearest driver is: " + driver.getName());
        } else {
            System.out.println("No drivers available");
        }

    }
}