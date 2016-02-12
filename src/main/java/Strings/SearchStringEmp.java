package Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//This example shows how we can search a word within a String object using indexOf()
//method which returns a position index of a word within the string if found. Otherwise it returns -1.

public class SearchStringEmp{
    public static void main(String[] args) {
        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("read");

        if(intIndex == - 1){
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + intIndex);
        }
    }
}
