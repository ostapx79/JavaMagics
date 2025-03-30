package org.example.string_lesson3;

public class StringBuilderBasic {
    public static void main(String[] args) {
        // Создаём StringBuilder
        StringBuilder builder = new StringBuilder();

        // Друг за другом можно добавлять строки или числа в конец строки
        builder.append("Wingardium ")
                .append("Leviosa");

        // builder2.toString() вернёт получившуюся строку
        String result = builder.toString();
        // Wingardium Leviosa
        System.out.println(result);

        StringBuilder sb = new StringBuilder("Wingardium Leviosa");
        // Границы строки и то, на что нужно заменить подстроку
        sb.replace(0, 9, "123456789");

        // Получим "123456789m Leviosa"
        System.out.println(sb);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("123")
                .append(456);

        // Метод перевернёт строку внутри StringBuilder
        builder2.reverse();
        String result2 = builder2.toString();

        // Получим строку "654321"
        System.out.println(result2);

        StringBuilder charm = new StringBuilder("Accio");
        // Указываем границы подстроки для удаления
        charm.delete(1, 3);
        // Получим "Aio" - начало включительно, конец - нет!
        System.out.println(charm);

        charm.deleteCharAt(0);
        charm.deleteCharAt(1);
        // Получим "i". Обратите внимание, результат предыдущих операций сохраняется
        System.out.println(charm);
    }
}
