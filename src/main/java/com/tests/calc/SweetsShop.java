package com.tests.calc;

public class SweetsShop implements Tasks {
    SweetsFactory sweetsFactory = new SweetsFactory();
    private static final String title = "4: Магазин вкусняшек";

    @Override
    public void run() {
        System.out.println("Формируется подарок...");
        sweetsFactory.factoryShow();
        }

    @Override
    public String toString() {
        return title;
    }
}
