package com.napier.sem;

public class App {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);

    }

    public static void add(int num1, int num2){
        int result = num1 + num2;
    }

    public static void subtract(int num1, int num2){
        int result = num1 - num2;
    }

    public static void multiply(int num1, int num2){
        int result = num1 * num2;
    }
}
