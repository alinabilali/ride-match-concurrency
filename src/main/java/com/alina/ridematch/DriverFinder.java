package com.alina.ridematch;

import java.util.List;
import java.util.Optional;

public class DriverFinder {
    public static Optional<Driver> findNearestDriver(Rider rider, List<Driver> drivers) {
        double smallestDistanceFound = Double.MAX_VALUE;
        Optional<Driver> bestDriver = Optional.empty();

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                // calculate distance, compare, possibly update bestDriver and smallestDistanceFound
                double correctDistance = DistanceCalculator.distance(driver.getX(), driver.getY(),rider.x(), rider.y());
                if(correctDistance < smallestDistanceFound) {
                    smallestDistanceFound = correctDistance;

                    bestDriver = Optional.of(driver);

                }
            }

        }

        return bestDriver;


    }
}
