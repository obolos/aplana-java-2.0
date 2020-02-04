package com.tests.calc.Model.presentsBySize;
import com.tests.calc.Model.presentsComponents.Sweets;

import java.util.ArrayList;
import java.util.List;

public class ChristmasPresent {
    private String[] sweetsNames;
    private List<Sweets> sweets = new ArrayList<>();

    public void setSweetsNames(String[] sweetsNames) {
        this.sweetsNames = sweetsNames;
    }

    public String[] getSweetsNames() {
        return sweetsNames;
    }

    public void addSweets (List<Sweets> any) {
        sweets.addAll(any);
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public double showWeight() {
        double weight = 0;
        for (Sweets t : sweets)
            weight += t.getWeight();
        return weight;
    }


        public int showCost() {
            int sum = 0;
            for (Sweets t : sweets)
                sum += t.getCost();
            return sum;
        }





}
