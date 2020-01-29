package com.tests.calc;

import java.util.Arrays;
import java.util.Scanner;

public class Calc {

    private String [] operation = {"1: +", "2: -", "3: /", "4: *"};
    private Scanner scanner = new Scanner(System.in);
    private double x, y;
    private int opr = 0;

    public void calculateLogic() throws Exception {
        System.out.println("Введите число x");
        x = scanner.nextDouble();

        System.out.println("Выберите операцию");
        Arrays.stream(operation).forEach(System.out::println);
        opr = scanner.nextInt();

        System.out.println("Введите число y");
        y = scanner.nextDouble();

        System.out.println(operation(opr, x, y));

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

}
