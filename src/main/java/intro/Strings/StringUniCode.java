package intro.Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//This example shows you how to use codePointBefore()
//        method to return the character (Unicode code point) before the specified index.

public class StringUniCode{
    public static void main(String[] args){
        String test_string="Welcome to TutorialsPoint";
        System.out.println("String under test is = " + test_string);
        System.out.println("Unicode code point at"
                + " position 5 in the string is = "
                +  test_string.codePointBefore(5));
    }
}
