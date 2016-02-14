package HillelHomeWorkLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 14.02.16.
 *  Homework 2
 *  является ли число четным или нечетным
 *
 */
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Please enter digit: ");

        int digit;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            digit = Integer.parseInt(reader.readLine());

            if (digit % 2 == 0){

                System.out.println(digit + " is even");

            } else {

                System.out.println(digit + " is odd");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
