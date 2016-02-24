package intro.HillelHomeWorkLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 14.02.16.
 *  Homework 5
 *  Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

 */
public class NearestForTen {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {

            System.out.println("Please enter first number: ");
            int intDigit1 = Integer.parseInt(reader.readLine());

            System.out.println("Please enter second number: ");
            int intDigit2 = Integer.parseInt(reader.readLine());

            int absIntDigit1 = Math.abs(10 - intDigit1);
            int absIntDigit2 = Math.abs(10 - intDigit2);

            if (absIntDigit1 == absIntDigit2){

                System.out.println(intDigit1 + " such close for 10, as " + intDigit2);

            } else if (absIntDigit1 < absIntDigit2){

                System.out.println(intDigit1 + " closer for 10, then " + intDigit2);

            } else {

                System.out.println(intDigit2 + " closer for 10, then " + intDigit1);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
