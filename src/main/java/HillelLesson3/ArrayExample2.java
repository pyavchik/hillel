package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class ArrayExample2 {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 1, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 9){
                break;
            }
            System.out.println(array[i]);
        }

        System.out.println("Continue cycle ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 9){
                continue;
            }
            System.out.println(array[i]);
        }

    }
}
