package HillelHomeWorkLesson4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by pyavchik on 21.02.16.
 * 1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
 @ заменяется на [ at ]
 . заменяется на [ dot ]

 Пример ввода:
 person@gmail.com
 Результат:
 person[ at ]gmail[ dot ].com

 */
public class EmailChanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your e-mail: ");
        String email = scanner.nextLine();

        email = email.replace("@", "[ at ]").replace(".", "[ dot ]");
        System.out.println("Changed email: " + email);

    }
}
