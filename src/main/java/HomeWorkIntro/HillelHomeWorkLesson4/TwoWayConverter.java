package HomeWorkIntro.HillelHomeWorkLesson4;

import java.util.Scanner;

/**
 * Created by test on 22.02.16.
 * 4. Создайте класс в котором будут 2 статических метода:
 - перевод числа из 2ой в 10ную систему счисления
 - перевод числа из 10ной в 2ную систему счисления
 В методе main другого класса дайте возможность пользователю выбрать, что он хочет делать из 2х вариантов и вызовите соответствующую функцию.

 Пример ввода:
 Choose the option:
 1 - Convert a number from binary to denary
 2 - Convert a number from denary to binary
 Enter: 2
 Number: 12
 Результат:
 1100

 */
public class TwoWayConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the option:\n" +
                "1 - Convert a number from binary to denary\n" +
                "2 - Convert a number from denary to binary");

        int option = scanner.nextInt();

        if (option == 1){
            int result = from2To10();
            System.out.println(" is " + result + " in denary");

        } else if (option == 2){
            System.out.print("Enter denary number to convert: ");
            int denaryNumber = scanner.nextInt();

            System.out.println(from10to2(denaryNumber));


        } else {

            System.out.println("Be careful! only 1 or 2 available! ");

        }

    }

    private static int from2To10() {
        int binary[] = getArrayFromConsole();
        int result=0;
        for (int i=0;i<binary.length;i++){
            result = result + (int) Math.pow(2,binary.length-1-i)*binary[i];
        }
        System.out.print("binary ");
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i] + " ");
        }
        return result;
    }

    public static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How meny elements in binary number: ");
        int size = scanner.nextInt();

        System.out.print("Fill up binary number: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i+1) + " number of binary number: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static String from10to2(int denaryDigit) {

        int binaryDigit = 0;

        String temp = "";
        while(denaryDigit !=0){
            binaryDigit = denaryDigit%2;
            temp = binaryDigit + temp;
            denaryDigit = denaryDigit/2;
        }

        return temp;
    }
}
