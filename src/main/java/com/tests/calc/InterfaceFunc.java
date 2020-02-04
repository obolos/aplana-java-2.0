package com.tests.calc;
import java.util.Arrays;
import java.util.Scanner;

class InterfaceFunc implements CommonObject<Tasks> {

    static Tasks [] menuItems = {new Calc(), new MaximumWord(), new RandomArrayNumbers(), new SweetsShop()};

    InterfaceFunc() throws Exception {

            System.out.println("Выберите приложение");
            Arrays.stream(menuItems).forEach(System.out::println);
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();
            if (num == 1)
                getInstance(new Calc());
            else if (num == 2)
                getInstance(new MaximumWord());
            else if (num == 3)
                getInstance(new RandomArrayNumbers());
            else if (num == 4)
               getInstance(new SweetsShop());
            else {
                System.out.println("Ta Ta for now!");
                System.exit(0);

            }
        }

    @Override
    public void getInstance(Tasks instance) {
            instance.run();
    }
}
