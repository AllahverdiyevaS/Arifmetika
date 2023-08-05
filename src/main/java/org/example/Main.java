package org.example;

public class Main {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 7.1;

        addition(9.2, 7.1);
        subtraction(10.1, 1.1);
        multiplication(5.9, 4.2);
        division(45.5, 5.5);
    }

    public static void addition(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    public static void subtraction(double a, double b) {
        double result = a - b;
        System.out.println(result);
    }

    public static void multiplication(double a, double b) {
        double result = a * b;
        System.out.println( result);
    }
    public static void division(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Деление на 0 невозможно.");
        }
    }
}
