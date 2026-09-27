package com.alina.ridematch;

public class Rider {
    private final String name;
    private final double x;
    private final double y;

    public Rider(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public String getName() {
        return name;
    }
}