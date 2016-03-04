package OOP.HillelHomeWorkLesson7;

/**
 * Created by test on 03.03.16.
 */
public class AdvancedCryptExample {


    public static void main(String[] args) {
        AdvancedCrypt advancedCrypt = new AdvancedCrypt(new char[]{'1', '2', '3'});

        System.out.println(advancedCrypt.crypt("Stroka"));
        System.out.println(advancedCrypt.crypt("ba`EFGC@A^]\\ZYXPSR`GA\\XR"));

    }
}
