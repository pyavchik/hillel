package intro.Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//Following example compares two strings by using str compareTo (string) ,
//str compareToIgnoreCase(String) and str compareTo(object string) of string class
//and returns the ascii difference of first odd characters of compared strings .

public class StringCompareEmp{
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(objStr.toString()));
    }
}
