package com.tests.calc.Model.presentsComponents;

public class Sweets<T> {
    private String name = null;
    private double weight = 0.00;
    private int cost = 0;
    private T property;

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

    public T getProperty() {
        return property;
    }

    public void setProperty(T property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return  "Название: '" + name + '\'' +
                ", \nвес: " + String.format("%.2f", weight) +"Kg"+
                ", \nцена: " + cost +"$"+
                 "\nдень поставки: " + property + "\n";
    }
}
