/**
 * Created by User on 12.02.2016.
 */
public class Minimum {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 2;

        if ((num1 < num2) && (num1 < num3)){

            System.out.println("min num1 = " + num1);

        }else if ((num2 < num1) && (num2 < num3)){

            System.out.println("min num2 = " + num2);

        }

        else System.out.println("min num3 = " + num3);
    }
}
