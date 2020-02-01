package com.tests.calc.Model;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SweetCreator {
    private static final String[] sweets = {
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie"};

    public static void main(String[] args) {
        Hogmanay hg = new Hogmanay();
        hg.setSweets(createSome());
        hg.getSweets();
    }

    private static CustomSweet[] createSome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько сладостей будет в подарке?");

        int countSweets = sc.nextInt();

        CustomSweet[]  presents = new CustomSweet[countSweets];
        for (int i = 0; i < countSweets; i++) {
            presents[i] = new CustomSweet();
            presents[i].setName(sweets[ThreadLocalRandom.current().nextInt(0, 14)]);
        }
        return presents;
    }
}
