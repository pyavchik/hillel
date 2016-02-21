package HillelHomeWorkLesson4;

import java.util.Scanner;

/**
 * Created by test on 21.02.16.
 * 2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
 Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.

 Пример ввода:
 internationalization localization cat elephant monitor
 Результат:
 i18n l10n cat e6t m5r

 PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который поместит слова в массив и для каждого из них вызовет вашу функцию
 */
public class ShortFormWord {
    public static void main(String[] args) {

        split();

    }

    private static void split() {
        String wordBeforeConvertation [] = {"internationalization",
                                            "localization",
                                            "cat",
                                            "elephant",
                                            "monitor"};

        for (int i = 0; i < wordBeforeConvertation.length; i++) {

            System.out.println(getShortFormWord(wordBeforeConvertation[i]));

        }
    }


    private static String getShortFormWord(String word){
        String shortWord = "";

        if (word.length() < 4){

            shortWord = word;

        } else {

            shortWord = shortWord +  word.charAt(0) + (word.length() - 2) + word.charAt(word.length()-1);

        }

        return shortWord;
    }

}
