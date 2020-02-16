package com.tests.calc;

import java.util.*;

class MaximumWord  implements Tasks {
    private static final String title = "2: Поиск максимального слова";

    public void run() {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Задайте размер массива");
            int[] count = new int[scanner.nextInt() + 1];

            System.out.println("Вводите слова");
            ArrayList<String> words = new ArrayList<String>();
            for (int i = 0; i < count.length; i++) words.add(scanner.nextLine());
            System.out.println("MaxWord is : " + Collections.max(words, Comparator.comparingInt(String::length)));
        }

    }

    @Override
    public String toString() {
        return title;
    }

}
