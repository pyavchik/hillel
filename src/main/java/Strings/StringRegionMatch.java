package Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//Following example determines region matchs in two strings by using regionMatches() method.

public class StringRegionMatch{
    public static void main(String[] args){
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with Microsoft";

        boolean match = first_str.regionMatches(11, second_str, 12, 9);

        System.out.println("first_str[11 -19] == " + "second_str[12 - 21]:- " +  match);
    }
}
