package com.tests.calc;

import com.tests.calc.Model.presentsBySize.CheckList;
import com.tests.calc.Model.presentsBySize.ChristmasPresent;
import com.tests.calc.Model.presentsComponents.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class SweetsFactory {
    private String[] color = {"red", "blue", "green", "pink", "black"};
    private List<Sweets> sweets = new ArrayList<>();
    private ThreadLocalRandom tlr = ThreadLocalRandom.current();
    private ChristmasPresent christmasPresent = new ChristmasPresent();

    SweetsFactory() {
        christmasPresent.setSweetsNames(CheckList.getSweetsNames());
        createComponents(christmasPresent.getSweetsNames());
    }

    void createComponents(String[] sweetsNames) {
        try {
           for (int i = 0; i < sweetsNames.length; i++) {
               sweets.add(new Sweets(sweetsNames[i]));
               sweets.get(i).setWeight(tlr.nextDouble(0.2, 3.3));
               sweets.get(i).setCost(tlr.nextInt(3, 15));
               sweets.get(i).setColor(color[tlr.nextInt(0, 4)]);
           }

        } catch (Exception e) {e.printStackTrace();}
        christmasPresent.addSweets(sweets);
    }

    void factoryShow() {
        System.out.printf("Стоимость подарка: %s$\n Вес подарка: %.2fKg\n Сладости в подарке:\n %s\n",
        christmasPresent.showCost(),
        christmasPresent.showWeight(),
        christmasPresent.getSweets());
    }

}
