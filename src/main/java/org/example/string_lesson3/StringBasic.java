package org.example.string_lesson3;

public class StringBasic {
    public static void main(String[] args) {
        String charm = "Wingardium Leviosa";
        String charm2 = new String("Wingardium Leviosa");
        System.out.println(charm);
        System.out.println(charm2);

        String wingardium = "Wingardium";
        String leviosa = "Leviosa";
        String combination = wingardium.concat(leviosa);
        String combination2 = wingardium + leviosa;
        System.out.println(combination);
        System.out.println(combination2);

        String equations = "2 + 2 = 4\n3 + 3 = 9\n";
        String tabs = "Заголовок!" +
                "\n\tАбзац 1" +
                "\n\tАбзац 2";

        System.out.println(equations + tabs);

        String lines = """
                Protego Maxima!
                Repello Inimicum!
                Fianto Duri!
        """;
        System.out.println(lines);

        String s1 = "Wingardium Leviosa";
        String s2 = "Wingardium" + " " + "Leviosa";
        String s3 = "Wingardium Leviosa Wingardium Leviosa";

        // Получим true
        System.out.println(s1.equals(s2));
        // Получим false
        System.out.println(s1.equals(s3));

        String ss1 = "REDUCIO";
        String ss2 = "inflatus";

        // Получится "reducio"
        System.out.println(ss1.toLowerCase());
        // Получится "INFLATUS";
        System.out.println(ss2.toUpperCase());

        String charm3 = "CHARM";
        // Получим 'C'
        System.out.println(charm3.charAt(0));
        // Получим 'M'
        System.out.println(charm3.charAt(4));
//        // Получим ошибку, так как в строке нет символа под номером 8
//        System.out.println(charm3.charAt(8));
//        // Получим ошибку, так как не поддерживаются отрицательные индексы
//        System.out.println(charm3.charAt(-1));

        String str = "Bombarda Maxima!";
        // Получим 16. Пробелы и символы - считаются!
        System.out.println(str.length());

        String charm4 = "Bombarda Maxima!";
        // Получим true
        boolean charmStart1 = charm4.startsWith("Bom");
        // Получим false
        boolean charmStart2 = charm4.startsWith("ard");
        System.out.println(charmStart1);
        System.out.println(charmStart2);

        // Получим true
        boolean charmEnd1 = charm4.endsWith("xima!");
        // Получим false
        boolean charmEnd2 = charm4.endsWith("Max");
        System.out.println(charmEnd1);
        System.out.println(charmEnd2);

        String charm5 = "Bombarda Maxima!";
        // Получим 9, начиная с 9-го символа в строке содержится "Maxima"
        System.out.println(charm5.indexOf("Maxima"));
        // Получим -1, потому что такой подстроки нет
        System.out.println(charm5.indexOf("schooooooool"));
        // contains вернёт true, если подстрока содержится в строке
        System.out.println(charm5.contains("Bom"));
        // contains вернёт false, если подстрока НЕ содержится в строке
        System.out.println(charm5.contains("Bum"));

        String charm6 = "Bombarda Maxima!";
        String result1 = charm6.replace("Bombarda", "Wow!"); // заменяет "Bombarda" на "Wow!"
        System.out.println(result1); // получим "Wow! Maxima!"

        String result2 = charm6.replaceAll("a", "0"); // заменяет все a в строке charm на 0
        System.out.println(result2); // получим "Bomb0rd0 M0xim0!"


        String charm7 = "\n   \t Accio  \t \n    ";
        String result = charm7.trim();
        // получим просто "Accio" - все отступы пропадут, а длина строки изменится
        System.out.println(result);

        String s1s = " _ ";
        String s2s = "\t      \n";
        String s3s = "";
        // Получим false и false
        System.out.println(s1s.isBlank());
        System.out.println(s1s.isEmpty());

        // Получим true и false
        System.out.println(s2s.isBlank());
        System.out.println(s2s.isEmpty());

        // Получим true и true
        System.out.println(s3s.isBlank());
        System.out.println(s3s.isEmpty());

        String str1 = "123456";
        // Левая граница включительно, правая не включительно
        String result3 = str1.substring(1, 5);
        // Получим строку "2345"
        System.out.println(result3);

        // Начиная со второго индекса
        String result4 = str1.substring(2);
        // Получим строку "3456"
        System.out.println(result4);

        // Получим строку из 2-х рандомные числа
        // Результат сложения строки с числом – строка, не число
        String initial = String.valueOf(50) + 11;
        System.out.println(initial);

        // Соединяем строки через пробел
        // Первый аргумент метода – разделитель (передаем пробел)
        String result5 = String.join(" ", "Bombarda", "Maxima", "!");
        // Получим строку "Bombarda Maxima !"
        System.out.println(result5);

        String result6 = String.join(", ", "1", "2", "3", "4", "5");
        // Получим строку "1, 2, 3, 4, 5"
        System.out.println(result6);

        String res1 = String.format("Строка - %s, Число - %d", "Accio", 42);
        // Получим "Строка - Accio, Число - 42"
        System.out.println(res1);
    }
}
