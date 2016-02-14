package HillelHomeWorkLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 14.02.16.
 *  Homework 3
 * Даны 2 числа, определить делится ли первое число на второе без остатка
 *
 */
public class ModuloOfTheDivisionOf2Numbers {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Please enter first digit: ");
            int intDigit1 = Integer.parseInt(reader.readLine());

            System.out.println("Please enter second digit: ");
            int intDigit2 = Integer.parseInt(reader.readLine());

            if(intDigit2 == 0){

                System.out.println("Second number can not be 0");

            } else if (intDigit1 % intDigit2 == 0){

                System.out.println(intDigit1 + " divides " + intDigit2 + " without residue");

            } else System.out.println(intDigit1 + " do ndt divides " + intDigit2 + " without residue");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
