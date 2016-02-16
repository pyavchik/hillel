package HillelLesson3;

import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerExample {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + b);

    }
}
