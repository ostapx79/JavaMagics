package org.example.variables_lesson2;

public class IntBasicVariable {
    public static void main(String[] args) {
        int a = 12, b = 4;
        int resultPlus = a + b; // 16
        int resultMinus = a - b; // 8
        int resultMul = a * b; // 48
        int resultDiv = a / b; // 3
        int result = resultPlus + resultMinus + resultMul + resultDiv - 1000;
        System.out.println(result);
        System.out.println();

        // по приоритету сначала вычисляется умножение и деление,
        // а затем сумма и разность - все по математическим правилам
        int a1 = 1 + 2 * 5;           // будет равно 11
        int b1 = (1 + 2) * 5;         // будет равно 15
        int c1 = 5 * 5 - (4 / 2 - 4); // будет равно 25 - (2 - 4) = 25 + 2 = 27
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println();

        int a2 = 5 % 3;   // Получится остаток **2**, потому что 5 не делится на цело на 3
        long b2 = 50 % 10; // Получится остаток **0**, потому что 50 нацело делится на 10
        System.out.println(a2);
        System.out.println(b2);
        System.out.println();

        int counter = 5;
        counter++;    // Постфиксный инкремент: сначала возвращает значение, затем добавляет единицу
        ++counter;    // Префиксный инкремент: сначала добавляет единицу, затем возвращает значение
        counter += 3; // Добавляет 3 к переменной
        counter /= 2; // Делит на 2
        counter *= 2; // Умножает на 2
        System.out.println(counter);
    }
}
