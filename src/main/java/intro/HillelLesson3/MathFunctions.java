package intro.HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class MathFunctions {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = -3;

        int minNumber = Math.min(a, b);
        int absNumber = Math.abs(c);
        int maxNumber = Math.max(a, b);

        System.out.println(minNumber);
        System.out.println("Abs value: " + absNumber);
        System.out.println(maxNumber);
    }
}