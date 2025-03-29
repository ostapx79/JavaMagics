package org.example.variables_lesson2;

import java.util.Random;

public class BooleanBasicVariable {
    public static void main(String[] args) {
        boolean isMuggle = false;
        boolean introCourseIsGreat = true;
        System.out.println(isMuggle);
        System.out.println(introCourseIsGreat);
        System.out.println();

        int number = new Random().nextInt();       // Создаем случайное число
        boolean isFirstEven = number % 2 == 0;     // true, если число чётное; иначе false
        boolean isFirstOdd = number % 2 != 0;      // true, если число нечётное; иначе false

        int number2 = new Random().nextInt();      // Создаем еще одно случайное число
        boolean isFirstBigger = number > number2;  // true, если первое число больше второго; иначе false
        boolean isFirstLowerOrEqual = number <= number2; // true, если первое число меньше или равно второму; иначе false

        // Можно использовать другие булевые переменные при вычислениях
        // Также можно расставлять скобки для задания приоритета операций
        boolean result = (isFirstEven && isFirstOdd) || isFirstBigger;
        System.out.println(result);
    }
}
