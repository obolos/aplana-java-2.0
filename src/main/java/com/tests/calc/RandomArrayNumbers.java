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

        int minNegative = Arrays.stream(numbers).min().getAsInt();
        int minPositive = Arrays.stream(numbers).filter(s-> s > 0).min().getAsInt();

        int index1 = searchIndex(numbers, minNegative);
        int index2 = searchIndex(numbers, minPositive);

        replaceElements(numbers, index1, index2);

        System.out.println("\nрезультирующий массив");
        for (int a : numbers) System.out.print(a + " | ");
        System.out.println("\nNumbers " + minNegative + " : " + minPositive);
        }

        private int searchIndex (int[] arr, int value) {
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == value) {
                    value = i;
                    break;
                }

            return value;
        }

        private void replaceElements (int[] arr, int index1, int index2) {
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }

    @Override
    public String toString() {
        return title;
    }
    }

