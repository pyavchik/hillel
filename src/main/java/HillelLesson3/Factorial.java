package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int factorial = 1;

        for (int i = 1; i < a + 1; i++) {
            System.out.println(factorial =  factorial * i);
        }

    }
}
