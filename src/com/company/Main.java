package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "Hello world";

        int birthday = 1983;
        int age = 2016 - birthday;

        long years = 2016L;
        long days = 365L;
        long hours = 24L;
        long seconds = 3600L;
        long millis = 1000L;

        long millisecondsFromBC = 2016L * 365L * 24L * 3600L * 1000L;

        int intYears = (int) years;

        System.out.println(intYears);////!!!!! Danger!!!!


        System.out.println(string);
        System.out.println(age);

        System.out.println("Hello, world! I am " + age);

        System.out.println(millisecondsFromBC);
        ////// first lesson
    }
}
