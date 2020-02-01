package com.tests.calc;

import java.util.*;

public class MaximumWord {
    private int[] count;
    private ArrayList<String> words = new ArrayList<String>();

    MaximumWord() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        count = new int[scanner.nextInt() + 1];

        System.out.println("Вводите слова");
        for (int i = 0; i < count.length; i++)
                    words.add(scanner.nextLine());
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("MaxWord is : " + words.get(words.size() - 1));

    }

}
