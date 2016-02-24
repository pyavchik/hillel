package intro.HillelHomeWorkLesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 * 7. Найти сумму всех четных и сумму всех нечетных элементов массива

 */
public class SumOddsEvenElementsOfArray {
    public static void main(String[] args) {
        System.out.println("How many elements in array I need to generate?");

        Scanner scanner = new Scanner(System.in);
        int numberOfElementsArray = scanner.nextInt();

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

        int sumEven = 0;
        int sumOdds = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sumEven = sumEven + array[i];
                } else if (array[i] % 2 != 0){
                sumOdds = sumOdds + array[i];
            }

        }
        System.out.println("sum even elements of array: " + sumEven);
        System.out.println("sum odds elements of array: " + sumOdds);

    }

}
