package org.example.string_lesson3.homework;

import java.util.Random;

public class secondTask {
    public static void main(String[] args) {
        castSpell();
    }

    private static void castSpell() {
        // 1. Создайте строку в верхнем регистре: ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA.
        String str = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";

        // 2. Приведите строку к нижнему регистру.
        str = str.toLowerCase();

        // 3. Создайте случайное число int start с помощью класса Random.
        // Число должно быть в диапазоне от 0 до 50.
        int start = new Random().nextInt(0, 50);

        // 4. Создайте подстроку от строки, содержащей слова заклинаний,
        // которая будет начинаться с индекса, равного start.
        str = str.substring(start);

        // 5. Создайте объект класса StringBuilder spell, запишите
        // полученную строку выше в этот объект.
        StringBuilder spell = new StringBuilder();
        spell.append(str);
        spell.reverse();

        System.out.println(spell);


        char firstS = spell.charAt(0);
        char lastS = spell.charAt(1);

        spell.replace(0, 1, String.valueOf(lastS));
        spell.replace(1, 2, String.valueOf(firstS));

        System.out.println(spell);


        // System.out.println(str);
    }
}
