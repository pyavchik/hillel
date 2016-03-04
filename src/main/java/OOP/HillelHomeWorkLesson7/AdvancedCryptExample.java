package OOP.HillelHomeWorkLesson7;

/**
 * Created by test on 03.03.16.
 */
public class AdvancedCryptExample {


    public static void main(String[] args) {
        AdvancedCrypt advancedCrypt = new AdvancedCrypt(new char[]{'$', '%', '!'});

        String stroka = "Stroka";

        System.out.println("Crypted " + stroka + " is " + advancedCrypt.crypt(stroka));
        System.out.println("Decripted " + advancedCrypt.crypt(stroka) + " is " + advancedCrypt.crypt("wQSKN@"));

    }
}
