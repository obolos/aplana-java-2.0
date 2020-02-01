package com.tests.calc;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class RandomArrayNumbers  implements Tasks {
   private int[] numbers = new int[20];
   private static final String title = "3: Массив из 20 элементов" ;

    public void run() {
        fillArray();
    }

    private void fillArray() {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = ThreadLocalRandom.current().nextInt(-10, 11);

        System.out.println("исходный массив");
        for (int a : numbers) System.out.print(a + " | ");
        System.out.println("\nотсортированный массив");
        Arrays.sort(numbers);
        for (int a : numbers) System.out.print(a + " | ");
        int tmp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = tmp;
        System.out.println("\nрезультирующий массив");
        for (int a : numbers) System.out.print(a + " | ");
        System.out.println("");
        }

    @Override
    public String toString() {
        return title;
    }
    }

