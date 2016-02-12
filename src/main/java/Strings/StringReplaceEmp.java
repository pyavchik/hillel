package Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//This example describes how replace method of java String class
//can be used to replace character or substring by new one.

public class StringReplaceEmp{
    public static void main(String args[]){
        String str="Hello World";
        System.out.println( str.replace( 'H','W' ) );
        System.out.println( str.replaceFirst("He", "Wa") );
        System.out.println( str.replaceAll("He", "Ha") );
    }
}
