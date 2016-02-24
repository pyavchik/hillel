package intro.HillelHomeWorkLesson3;

/**
 * Created by oleksandrpiavchik on 17.02.16.
 * 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….


 */
public class FirstFiftyFiveElements {
    public static void main(String[] args) {
        for (int i = 1; i < 56; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
