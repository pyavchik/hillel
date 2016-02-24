package intro.HillelHomeWorkLesson3;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

 */
public class PositiveNumbers {

    public static void main(String[] args) {

        for (int i = 90; i > -1; i = i - 5) {

            System.out.print(i + " ");

        }

    }

}
