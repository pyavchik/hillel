package intro.Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//Following example changes the case of a string to upper case by using String toUpperCase() method.

public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "string abc touppercase ";
        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: " + strUpper);
    }
}
