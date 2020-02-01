package com.tests.calc;

import java.util.Arrays;
import java.util.Scanner;

class Calc implements Tasks {
    private static final String title = "1: Калькулятор";

    public void run() {
        for(;;) {
            try {
                calculateLogic();
            } catch (Exception e) {
                System.out.println("Неверный ввод");
                System.exit(0);

            }
        }
    }

    private void calculateLogic() {
        String [] operation = {"1: +", "2: -", "3: /", "4: *"};
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Введите число x");
        double x = scanner.nextDouble();

        System.out.println("Выберите операцию");
        Arrays.stream(operation).forEach(System.out::println);
        int opr = scanner.nextInt();
            operation[opr-1].toString();

            System.out.println("Введите число y");
            double y = scanner.nextDouble();

            System.out.println(operation(opr, x, y));
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Вы ввели не существующую операцию");
            calculateLogic();
        }

    }

    private double operation(int sign, double a, double b) {
        switch(sign) {
            case (1):
                return a + b;

            case (2):
                return a - b;

            case (3):
                return a / b;

            case (4):
                return a * b;

            default:
                return 0;
        }
    }


    @Override
    public String toString() {
        return title;
    }

   }
