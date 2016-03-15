package HomeWorkOOP.HillelHomeWorkLesson6;

/**
 * Created by test on 29.02.16.
 */
public class Crypt {

    public static String cryptStringWithCharKey(String message, char key) {

        char[] messageArray = message.toCharArray();

        char[] cryptedMessageArray = new char[messageArray.length];

        for (int i = 0; i < messageArray.length; i++) {
            cryptedMessageArray[i] = (char) (messageArray[i] ^ key);

        }

        String cryptedString = String.copyValueOf(cryptedMessageArray);

        return cryptedString;
    }

}
