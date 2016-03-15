package HomeWorkIntro.HillelHomeWorkLesson3;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

 */
public class FourDigitNumbers {

    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i = i + 3) {
            System.out.print(i + " ");
        }

    }

}
