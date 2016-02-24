package intro.HillelHomeWorkLesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 *
 * 5. Найти сумму первых n элементов массива

 */
public class FindSumNElementsArray {

    public static void main(String[] args) {

        System.out.println("How many elements in array I need to generate?");

        Scanner scanner = new Scanner(System.in);
        int numberOfElementsArray = scanner.nextInt();

        if (numberOfElementsArray >= 20){

            int array[] = new int[numberOfElementsArray];

            Random random = new Random();

            for (int i = 0; i < numberOfElementsArray; i++) {
                array[i] = random.nextInt(10);
            }

            System.out.println("");

            System.out.print("Random array with: " + numberOfElementsArray + " elements " + "{ ");

            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i] + " ");

            }

            System.out.println("}");

            System.out.println("");
            System.out.println("How many first elements summary we are looking for?");
            System.out.println("");

            int n = scanner.nextInt();

            int j = 0;
            int summ = 0;
            while (j < n){
                summ = summ + array[j];
                j++;
            }

            System.out.println("");
            System.out.println("Summary of first " + n + " elements of array: " + summ);

        } else {

            System.out.println("It is too small array for this program");
            System.out.println("We need at least 20 elements =)");

        }

    }

}
