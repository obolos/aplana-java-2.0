package com.tests.calc;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            InterfaceFunc.start();
        }
        catch (Exception e) {
            System.out.println("Ta Ta for now!");
            System.exit(0);
        }

    }
}
