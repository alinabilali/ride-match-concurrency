package com.alina.ridematch;

public class Driver {

    private final String name;
    private final double x;
    private final double y;
    private boolean isAvailable;

    public Driver(String name, double x, double y, boolean isAvailable) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}