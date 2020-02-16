package com.tests.calc;

import com.tests.calc.Model.presentsBySize.CheckList;
import com.tests.calc.Model.presentsBySize.ChristmasPresent;
import com.tests.calc.Model.presentsComponents.*;
import com.tests.calc.candyShop.СookingDay;

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
        christmasPresent.addSweets(createComponents(christmasPresent.getSweetsNames()));
    }

    List<Sweets> createComponents(String[] sweetsNames) {
        try {

           for (int i = 0; i < sweetsNames.length; i++) {
              switch (sweetsNames[i]) {
                  case "Cupcake":
                       createSweets("Cupcake", СookingDay.MONDAY);
                      break;
                  case "Donut":
                       createSweets("Donut", СookingDay.TUESDAY);
                      break;
                  case "Eclair":
                      createSweets("Eclair", СookingDay.THURSDAY);
                      break;
                  case "Froyo":
                      createSweets("Froyo", СookingDay.WEDNESDAY);
                      break;
                  default:
                      createSweets(sweetsNames[i], СookingDay.FRIDAY);
                      break;
              }
           }

        } catch (Exception e) {e.printStackTrace();}
        return sweets;
    }

    void factoryShow() {
        System.out.printf("Стоимость подарка: %s$\n Вес подарка: %.2fKg\n Сладости в подарке:\n %s\n",
        christmasPresent.showCost(),
        christmasPresent.showWeight(),
        christmasPresent.getSweets());
    }

    void createSweets(String name, СookingDay day) {
        Sweets<СookingDay> $ = new Sweets<СookingDay>(name);
        $.setCost(tlr.nextInt(3, 15));
        $.setWeight(tlr.nextDouble(0.2, 3.3));
        $.setProperty(day);
        sweets.add($);

}
}
