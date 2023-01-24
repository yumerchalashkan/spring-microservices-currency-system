package com.microservices.currencyservice.beans;

public class Bounds {
    private int minimum;
    private int maximum;

    public Bounds(){

    }
    public Bounds(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Bounds{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
