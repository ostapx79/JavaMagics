package org.example.branching_lesson4;

public class Branching3 {
    public static void main(String[] args) {
        int num = 4;
        if (num > 5) {
            num += 5;
            System.out.println("Теперь число больше чем 10");
        }
        System.out.println(num);
    }
}
