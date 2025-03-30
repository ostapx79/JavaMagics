package org.example.branching_lesson4;

import java.util.Random;

public class Branching {
    public static void main(String[] args) {
        // у ветки есть вот столько маленьких веточек
        int branchCount = new Random().nextInt(1,10);

        // нам нужно выбрать только ветки, у которых больше 8 или ровно 8 веточек
        if (branchCount >= 8) {
            System.out.println("Число больше или равно 8. Ветка подходит.");
        } else {
            System.out.println("Слишком маленькое число. Мало веток. :c");
        }
    }
}
