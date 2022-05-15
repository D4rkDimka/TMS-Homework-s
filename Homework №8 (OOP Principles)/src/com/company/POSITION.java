package com.company;

public enum POSITION {
    WORKER(1.5, 1000),
    DIRECTOR(2.5, 2000);

    private double coefficient;
    private int baseRate;

    POSITION(double coefficient, int baseRate) {
        this.coefficient = coefficient;
        this.baseRate = baseRate;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getBaseRate() {
        return baseRate;
    }
}

