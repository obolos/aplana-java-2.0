package com.tests.calc;
import java.util.Scanner;

public class InterfaceFunc {

    public static void start() throws Exception {

        System.out.printf("Выберите приложение\n %s\n %s\n", "1: Калькулятор", "2: Поиск максимального слова");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num == 1)
            calculatorStart();
        else if (num == 2)
            maximumWordStart();
        else
        {
            System.out.println("Ta Ta for now!");
            System.exit(0);
        }
    }

    private static void maximumWordStart() {
        MaximumWord mxw = new MaximumWord();
    }

    private static void calculatorStart() {
        Calc calc = new Calc();
        for(;;) {
            try {
                calc.calculateLogic();
            } catch (Exception e) {
                System.out.println("Хорошего дня!");
                System.exit(0);
            }
        }
    }
}
