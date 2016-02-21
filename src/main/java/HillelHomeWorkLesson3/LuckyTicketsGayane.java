package HillelHomeWorkLesson3;

/** Найти все счастливые билеты от 100000 до 999999 =899999  Суть программы в том что нужно найти все счастливые билеты.
 В билете 6 цифр, счастливыми будут те у которого сумма первых 3х цифр будет ровна сумме последних трех.
 нужно найти сколько всего счастливых в диапазоне от 100000 до 999999
 у тебя есть цикл, который перебирает числа от 100000 до 999999
 в этом цикле для каждого числа в этом диапазоне нужно проверить, что сумма его первых 3х цифр равна сумме последних 3х*/
public class LuckyTicketsGayane {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=100000; i<=999999; i++) {
            int n1 = i / 100000;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10;
            int n4 = (i / 100) % 10;
            int n5 = (i / 10) % 10;
            int n6 = i % 10;
            if (n1 + n2 + n3 == n4 + n5 + n6) {
                sum++;
            } }
        System.out.println(sum);
    }}