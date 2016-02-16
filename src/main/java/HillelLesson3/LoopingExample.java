package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class LoopingExample {
    public static void main(String[] args) {

        //for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //while
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j = j - 1;
        }

        //do while
        int k = 10;
        do {
            System.out.println(k);
            k++;
        }
        while (k <= 1);
    }
}
