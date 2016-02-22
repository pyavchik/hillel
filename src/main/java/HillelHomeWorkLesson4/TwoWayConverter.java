package HillelHomeWorkLesson4;

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
            System.out.print("Enter binary number to convert: ");
            int binaryNumber = scanner.nextInt();
            from2to10(binaryNumber);

        } else if (option == 2){
            System.out.print("Enter denary number to convert: ");
            int denaryNumber = scanner.nextInt();
            from10to2(denaryNumber);

        } else {

            System.out.println("Be careful! only 1 or 2 available! ");

        }

    }

    public static int from2to10(int binaryDigit) {

        int denaryDigit = 0;

        //convert code


        return denaryDigit;
    }

    public static int from10to2(int digit) {

        int binaryDigit = 0;

        //convert code

        return binaryDigit;
    }



}
