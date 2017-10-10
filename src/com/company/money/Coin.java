package com.company.money;

/**
 * Created by Daniil Sheidak on 10.10.2017.
 */
public class Coin {
    private double diameter; // правильная инкапсуляция
    private double weight; // правильная инкапсуляция
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) {
        if(value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }
    public double getWeight() { // правильное имя метода
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}