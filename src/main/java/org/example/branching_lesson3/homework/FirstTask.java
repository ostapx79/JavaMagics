package org.example.branching_lesson3.homework;

import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        // Первое задание
        // 1. В методе main c помощью new Random().nextInt() сгенерируйте 2 случайных целых числа.
        int firstNum = new Random().nextInt(50);
        int secondNum = new Random().nextInt(50);
        int sum;

        // 2. Если оба числа чётные, разделите каждое число на 2 и выведите в консоль сумму.
        if (firstNum % 2 == 0 && secondNum % 2 == 0) {
           firstNum /= 2;
           secondNum /= 2;
           sum  = firstNum + secondNum;
            System.out.println("Обо числа делится на 2");
           System.out.println(sum);
        } else if (firstNum % 2 == 0) {
           // 3. Иначе если только первое число делится на 2, разделите только первое число на 2
           // и выведите в консоль сумму полученного числа и второго числа.
           firstNum /= 2;
           sum = firstNum + secondNum;
            System.out.println("Только первое число делится на 2");
           System.out.println(sum);
        }  else if (secondNum % 2 == 0) {
            // 4. Иначе, если только второе число делится на 2, разделите только второе число на 2
            // и выведите результат вычисления в консоль.
            secondNum /= 2;
            sum = firstNum + secondNum;
            System.out.println("Только второе число делится на 2");
            System.out.println(sum);
        } else {
            // 5. Иначе (если никакое число не делится на 2) просто выведите в консоль сумму этих чисел.
            sum = firstNum + secondNum;
            System.out.println("Не одно число не делится на 2");
            System.out.println(sum);
        }

    }
}
