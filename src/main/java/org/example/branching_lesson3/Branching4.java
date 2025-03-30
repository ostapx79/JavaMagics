package org.example.branching_lesson3;

import java.util.Random;

public class Branching4 {
    public static void main(String[] args) {
        int branchCount = new Random().nextInt(1, 10);
        if (branchCount >= 8) {
            if (branchCount == 10) {
                System.out.println("Огромная ветка!");
            } else {
                System.out.println("Число больше или равно 8. Ветка подходит.");
            }
        }
    }
}
