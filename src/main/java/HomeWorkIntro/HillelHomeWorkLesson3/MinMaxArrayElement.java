package HomeWorkIntro.HillelHomeWorkLesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 *
 * 6. Найти минимальный и максимальный элемент массива


 */
public class MinMaxArrayElement {
    public static void main(String[] args) {

        int[] array = randomArrayGenerator();

        minElementOfArray(array);

        maxElementOfArray(array);

    }

    private static int[] randomArrayGenerator() {
        System.out.println("How many elements in array I need to generate?");

        Scanner scanner = new Scanner(System.in);
        int numberOfElementsArray = scanner.nextInt();

        int array[] = new int[numberOfElementsArray];

        Random random = new Random();

        for (int i = 0; i < numberOfElementsArray; i++) {

            array[i] = random.nextInt();

        }

        System.out.println("");

        System.out.print("Random array with: " + numberOfElementsArray + " elements " + "{ ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println("}");
        return array;
    }

    private static void minElementOfArray(int[] array) {
        int minElementOfArray = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minElementOfArray){
                minElementOfArray = array[i];
            }

        }

        System.out.println("Min element of array: " + minElementOfArray);
    }

    private static void maxElementOfArray(int[] array) {
        int maxElementOfArray = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxElementOfArray){
                maxElementOfArray = array[i];
            }

        }

        System.out.println("Max element of array: " + maxElementOfArray);
    }

}
