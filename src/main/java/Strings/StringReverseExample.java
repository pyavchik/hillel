package Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//Following example shows how to reverse a String after taking it from command line argument.
//The program buffers the input String using StringBuffer(String string) method,
//reverse the buffer and then converts the buffer into a String with the help of toString() method.

public class StringReverseExample{
    public static void main(String[] args){
        String string="abcdef";
        String reverse = new StringBuffer(string).
                reverse().toString();
        System.out.println("\nString before reverse: " + string);
                System.out.println("String after reverse: " + reverse);
    }
}
