package org.example.string_lesson3.homework;

import java.util.Random;

public class firstTask {
    /*
    Первое задание
        1. Создайте строку из 5 случайных чисел new Random().nextInt().
        2. Замените все единицы на символ ‘i’.
        3. У получившейся строки уберите все символы ‘-’
        4. У получившейся строки замените все нули на символ ‘o’.
        5. У получившейся строки замените все шестерки на символ ‘b’.
        6. Выведите результат в консоль.
        7. Узнайте, содержится ли подстрока “23” у получившейся строки.
        8. Узнайте индекс подстроки “ob”.
     */
    public static void main(String[] args) {
        int firstNumber = new Random().nextInt(100);
        int secondNumber = new Random().nextInt( 100);
        int thirdNumber = new Random().nextInt(100);
        int fourthNumber = new Random().nextInt(100);
        int fifthNumber = new Random().nextInt(100);
        String str = String.valueOf(firstNumber) +
                String.valueOf(secondNumber) +
                String.valueOf(thirdNumber) +
                String.valueOf(fourthNumber) +
                String.valueOf(fifthNumber);
        System.out.println(str);

        str = str.replace("1", "i");
        str = str.replace("-", "");
        str = str.replace("0", "o");
        str = str.replace("6", "b");

        System.out.println(str);

        System.out.println(str.contains("ob"));
    }
}
