package Homework1;

import java.util.Calendar;

public class Beverage {
    Double volume;
    public Beverage(String name, int price, int quantity, Calendar bestBefore, Double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }
    public Double getVolume() {
        return volume;
    }
    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume;
    }
}