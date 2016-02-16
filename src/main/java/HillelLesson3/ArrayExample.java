package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int a [] = {3, 5, 9, 1, 8};

        int sumArrayElements = 0;

        for (int l = 0; l < a.length; l++) {

            sumArrayElements = sumArrayElements + a[l];
        }

        System.out.println(sumArrayElements);


//        b[0] = 1;
//        b[1] = 2;
//        b[2] = 3;
//        b[3] = 4;
//        b[4] = 5;
//
//        int i = 0;
//        while (i <=4 ){
//            System.out.println(b[i++]);
//        }
//
//        System.out.println(b[3]);
//
//        System.out.println("");
//
//        for (int k = 0; k < a.length; k++) {
//            System.out.println(a[i]);
//        }

    }
}
