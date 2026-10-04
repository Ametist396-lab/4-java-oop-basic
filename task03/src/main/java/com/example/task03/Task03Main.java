package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 5);
        ComplexNumber number2 = new ComplexNumber(3, 9);

        System.out.println("число 1: " + number1);
        System.out.println("число 2: " + number2);
        System.out.println("сумма: " + number1.addition(number2));
        System.out.println("произведение: " + number1.multiplication(number2));
    }
}
