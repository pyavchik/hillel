package HomeWorkIntro.HillelHomeWorkLesson4;

import java.util.Scanner;

/**
 * Created by test on 21.02.16.
 * 3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
 Определить количество таких слов в тексте, в котором все слова введены через запятую.

 Пример ввода:
 deleveled, evitative, cat, dog, deified
 Результат:
 There are 3 palindromes in the text

 PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа

 */
public class Palindrome {

    public static void main(String[] args) {

        split(",");

    }

    private static String trim(String stringWithSpace){
        String stringWithoutSpace;
        stringWithoutSpace = stringWithSpace.replace(",", ", ");

        return stringWithoutSpace;
    }

    private static void split(String s){
        System.out.println("Please enter words: ");
        Scanner scanner = new Scanner(System.in);
        int palindromes = 0;

        String string = scanner.nextLine();

        String stringsArray[] = string.split(trim(s));

        for (int i = 0; i < stringsArray.length; i++) {
        String reverse = new StringBuffer(stringsArray[i]).reverse().toString();

            if (stringsArray[i].equals(reverse)) {
                palindromes++;
            }

        }

        System.out.println("There are " + palindromes + " palindromes in the text");

    }


}
