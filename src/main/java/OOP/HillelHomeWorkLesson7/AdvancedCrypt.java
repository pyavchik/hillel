package OOP.HillelHomeWorkLesson7;

/**
 * Created by test on 03.03.16.
 */
public class AdvancedCrypt {

    private char[]key;

    public AdvancedCrypt(char[]key) {
        this.key = key;
    }

    public String crypt(String message){
        char[] messageArray = message.toCharArray();

        char[] cryptedMessageArray = new char[messageArray.length];

        for (int i = 0; i < messageArray.length; i++) {
            int count;
            count = key.length;
            if (i < count) {
                cryptedMessageArray[i] = (char) (messageArray[i] ^ key[i]);
            } else count = 0;





        }

        String cryptedString = String.copyValueOf(cryptedMessageArray);

        return cryptedString;
    }

}

