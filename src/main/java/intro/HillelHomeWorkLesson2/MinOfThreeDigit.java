package intro.HillelHomeWorkLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 14.02.16.
 *  Homework 1
 *  Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
 */

public class MinOfThreeDigit {
    public static void main(String[] args) {
        System.out.println("Please enter three digits : ");

        int intDigit1;
        int intDigit2;
        int intDigit3;

        int min1;
        int min2;
        int min3;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            intDigit1 = Integer.parseInt(reader.readLine());
            intDigit2 = Integer.parseInt(reader.readLine());
            intDigit3 = Integer.parseInt(reader.readLine());

            if ((intDigit1 < intDigit2) && (intDigit1 < intDigit3)) {

                min1 = intDigit1;
                System.out.println("Min is: " + min1);

            } else if ((intDigit2 < intDigit1) && (intDigit2 < intDigit3)){

                min1 = intDigit2;
                System.out.println("Min is: " + min1);

            } else if ((intDigit3 < intDigit1) && (intDigit3 < intDigit2)){

                min1 = intDigit3;
                System.out.println("Min is: " + min1);

            } else if ((intDigit1 < intDigit3) && (intDigit1 == intDigit2)){

                min1 = intDigit1;
                min2 = intDigit2;
                System.out.println("Min is: " + min1 + " and " + min2);

            } else if ((intDigit2 < intDigit1) && (intDigit2 == intDigit3)){

                min2 = intDigit2;
                min3 = intDigit3;
                System.out.println("Min is: " + min2 + " and " + min3);

            } else if ((intDigit1 < intDigit2) && (intDigit1 == intDigit3)) {

                min1 = intDigit1;
                min3 = intDigit3;
                System.out.println("Min is: " + min1 + " and " + min3);

            }else if ((intDigit1 == intDigit2) && (intDigit2 == intDigit3)){

                min1 = intDigit1;
                min2 = intDigit2;
                min3 = intDigit3;
                System.out.println("Min is: " + min1 + " and " + min2 + " and " + min3);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}