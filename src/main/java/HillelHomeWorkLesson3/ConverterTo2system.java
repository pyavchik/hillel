package HillelHomeWorkLesson3;

import java.util.Scanner;

/**
 * Created by oleksandrpiavchik on 19.02.16.
 * 9. Перевести число в двоичную систему счисления (если не знаете что это можно не решать, объясню на занятии)
 *
 */
public class ConverterTo2system {

    public static void main(String[] args) {
        System.out.println("What number do you want to convert?");

        Scanner scanner = new Scanner(System.in);
        int numberForConvert = scanner.nextInt();

        System.out.println(numberForConvert + " in binary system " + Integer.toBinaryString(numberForConvert) );

    }

}
