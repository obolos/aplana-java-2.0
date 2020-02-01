package com.tests.calc;

public class Main {
    public static void main(String[] args) throws Exception {
        for (;;) {
            try {
                new InterfaceFunc();
            } catch (Exception e) {
                System.out.println("Ta Ta for now!");
                System.exit(0);
            }

        }
    }
}
