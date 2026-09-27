package com.alina.ridematch;

public class DistanceCalculator {

    public static double distance(double x1, double y1, double x2, double y2) {

        double deltaX = x1 - x2;
        double deltaY = y1 - y2;

        return Math.hypot(deltaX, deltaY);


    }
}