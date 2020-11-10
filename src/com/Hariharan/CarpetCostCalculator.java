package com.Hariharan;

public class CarpetCostCalculator {
    private double cost;

    public CarpetCostCalculator(double cost) {
        if (cost<0)
            this.cost=0;
        else
            this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
