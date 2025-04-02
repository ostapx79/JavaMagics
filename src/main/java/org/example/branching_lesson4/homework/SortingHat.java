package org.example.branching_lesson4.homework;

import java.util.Scanner;

public class SortingHat {
    Scanner scanner = new Scanner(System.in);
    public void sort() {
        // 1. Создайте строки с вопросами. Один вопрос — одна строка.
        String firstQuestion = "Ты предпочитаешь работать в команде? (Да/Нет)";
        String secondQuestion = "Ты любишь разгадывать головоломки? (Да/Нет)";
        String thirdQuestion = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
        String fourthQuestion = "Ты проявляешь заботу к существам и природе? (Да/Нет)";

        // 2. Теперь, когда строки созданы, нужно сделать так, чтобы они последовательно
        // выводились на экран, а затем пользователь должен ответить на вопрос. Действуем
        // так: выводим первую строку на экран, затем из консоли считываем ответ
        // пользователя. Чтобы считать ответ, используем класс Scanner и его метод
        // nextLine(). Будет выглядеть примерно вот так:
        System.out.println(firstQuestion);
        String firstAnswer = scanner.nextLine();
        System.out.println(secondQuestion);
        String secondAnswer = scanner.nextLine();
        System.out.println(thirdQuestion);
        String thirdAnswer = scanner.nextLine();
        System.out.println(fourthQuestion);
        String fourthAnswer = scanner.nextLine();

        // 3. Теперь, когда ответы на вопросы собраны, можем начинать распределение.
        // В зависимости от ответа пользователя шляпа принимает решение по
        // факультету. Ветвление!
        String answerYesToLowerCase = "да";
        String answerYesCapitalize = "Да";
        if (firstAnswer.equals(answerYesToLowerCase) || firstAnswer.equals(answerYesCapitalize)) {
            if (thirdAnswer.equals(answerYesToLowerCase) || firstAnswer.equals(answerYesCapitalize)) {
                System.out.println("Гриффиндор");
            } else if (fourthAnswer.equals(answerYesToLowerCase) || fourthAnswer.equals(answerYesCapitalize)) {
                System.out.println("Пуффендуй");
            } else if (secondAnswer.equals(answerYesToLowerCase) || secondAnswer.equals(answerYesCapitalize)) {
                if (firstAnswer.equals(answerYesToLowerCase) || firstAnswer.equals(answerYesCapitalize)) {
                    System.out.println("Когтевран");
                } else if (thirdAnswer.equals(answerYesToLowerCase) || thirdAnswer.equals(answerYesCapitalize)) {
                    System.out.println("Когтевран");
                } else {
                    System.out.println("Слизарин");
                }
            } else {
                System.out.println("Пуффендуй");
            }
        }
    }
}
