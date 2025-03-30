package org.example.branching_lesson4;

import java.util.Random;

public class Branching2 {
    public static void main(String[] args) {
        int branchCount = new Random().nextInt(1, 10);
        if (branchCount >= 8) {
            System.out.println("Кладем ветку в кучу больших веток.");
        } else if (branchCount == 5) {
            System.out.println("Древороги (существо с деревянным рогом) едят только ветки с пятью веточками!");
        } else if (branchCount == 1) {
            System.out.println("Ну, это посох!");
        } else {
            System.out.println("Такие нам сейчас не нужны. Будем топить ими камни!");
        }
    }
}
