package com.tests.calc.Model;

class Hogmanay {
private CustomSweet[] sweets;

    void setSweets(CustomSweet[] sweets) {
        this.sweets = sweets;
    }

    void getSweets() {
        for (CustomSweet sw : sweets) System.out.println(sw);

    }
}
