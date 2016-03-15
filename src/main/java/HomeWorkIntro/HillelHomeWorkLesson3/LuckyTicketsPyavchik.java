package HomeWorkIntro.HillelHomeWorkLesson3;

/**
 * Created by oleksandrpiavchik on 18.02.16.
 * 8. Найти все счастливые билеты от 100000 до 999999

 */
public class LuckyTicketsPyavchik {
    public static void main(String[] args) {
        int tickets = 100000;
        int tickets2 = 999999;
        int iter = 0;
        for (int i = tickets; i <= tickets2; i++) {
            int firstPart = i / 1000;
            int secondPart = i - firstPart * 1000;

            if(endSum(firstPart) == endSum(secondPart)){
                iter ++;
                System.out.println("Lucky ticket number "+ iter + ": " + i);

            }
        }
    }

    public static int endSum(int number)
    {
        int firstN, secondN, thirdN;
        firstN = number / 100;
        secondN = number / 10 - firstN * 10;
        thirdN = number - firstN * 100 - secondN * 10;

        return firstN+secondN+thirdN;
    }
}