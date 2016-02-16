package HillelLesson3;

import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerDelimeterExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
    }

}
