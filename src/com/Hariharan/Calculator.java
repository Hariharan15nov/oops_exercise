package com.Hariharan;

public class Calculator {
    private Floor floor;
    private CarpetCostCalculator carpet;

    public Calculator(Floor floor, CarpetCostCalculator carpet) {
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getTotalCost(){
        return ((floor.getArea())*carpet.getCost());
    }
}
