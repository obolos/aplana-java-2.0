package com.tests.calc.Model.presentsComponents;

public class Sweets {
    private String name = null;
    private double weight = 0.00;
    private int cost = 0;
    private String color = null;

    public Sweets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Название: '" + name + '\'' +
                ", \nвес: " + String.format("%.2f", weight) +"Kg"+
                ", \nцена: " + cost +"$"+
                ", \nцвет: " + color + "\n";
    }
}
