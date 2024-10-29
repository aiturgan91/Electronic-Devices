package com.example.electronicdevices8;
public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Life: " + batteryLife + " hours, Stylus: " + (hasStylus ? "Yes" : "No");
    }
}