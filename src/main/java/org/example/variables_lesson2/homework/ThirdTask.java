package org.example.variables_lesson2.homework;

public class ThirdTask {
    /*
    Малфой остался после уроков и получил задание: получить остатки от деления
    на 13, 14, 15, 16, 17, 19 числа 4199. Затем вычислить сумму остатков от деления.
    Давайте напишем код, который поможет ему это посчитать. Продолжаем работать в метод main.
     */

    public static void main(String[] args) {
        int firstNum = 4199 % 13;
        int secondNum = 4199 % 14;
        int thirdNum = 4199 % 15;
        int fourthNum = 4199 % 16;
        int fifthNum = 4199 % 17;
        int sixthNum = 4199 % 19;

        int resultSum = firstNum + secondNum + thirdNum + fourthNum + fifthNum + sixthNum;
        System.out.println(resultSum);
    }
}
