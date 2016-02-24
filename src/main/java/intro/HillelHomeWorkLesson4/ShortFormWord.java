package intro.HillelHomeWorkLesson4;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter words: ");
        String string = scanner.nextLine();

        String wordsBeforeConvertationArray[] = string.split(" ");
        System.out.println("");

        if (wordsBeforeConvertationArray[0].length() >=  1){
            System.out.print("Words after convert: ");
            for (int i = 0; i < wordsBeforeConvertationArray.length; i++) {

                System.out.print(getShortFormWord(wordsBeforeConvertationArray[i]) + " ");

            }

        }else {

            System.out.println("No words to convert =)");
            System.out.println("");

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
