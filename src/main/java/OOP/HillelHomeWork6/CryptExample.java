package OOP.HillelHomeWork6;

/**
 * Created by test on 29.02.16.
 */
public class CryptExample {

    public static void main(String[] args) {
        String stringForCripting = "Stroka";
        char secretKey = 'S';

        String cryptedString = Crypt.cryptStringWithCharKey(stringForCripting, secretKey);
        System.out.println("Crypted string " + stringForCripting + " - " + cryptedString);

        String decryptedString = Crypt.cryptStringWithCharKey(cryptedString, secretKey);
        System.out.println("Decrypted string " + cryptedString + " - " + decryptedString);

    }

}
