package HillelLesson1;

/**
 * Created by pyavchik on 10.02.16.
 */
public class MyFirstClass {
    public static void main(String args[]) {
        String message = "Hello world!";
        int birthYear = 1984;
        int age = 2016 - birthYear;

        message = "Hello, " + "world! I'm " + age;

        System.out.println(message);

        long years = 2016L;
        long days = 365;
        long hours = 24;
        long seconds = 3600;
        long millis = 1000;

        long millisecondsFromBC = 2016 * 365 * 24 * 3600 * 1000;

        millisecondsFromBC = years * days * hours * seconds * millis;

        millisecondsFromBC = 2016 * 365 * 3600 * 1000 * hours;

        millisecondsFromBC = 2016L * 365L * 24L * 3600L * 1000L;

        int intYears = (int) years;

        millisecondsFromBC = (long) (2016 * 365) * 24 * 3600 * 1000;

        System.out.println(millisecondsFromBC);

        //DGovorov Examples
        long prettyBigNumber = 1_000_000_000;
        System.out.println(prettyBigNumber + " Compiler removes all '_' in numbers");

        int prettyBigNumberBinary = 0b1111_0100_0010_0100_0000; // ПРЕФИКСЫ для чисел

        //числа с плавающей точкой не используются в финансовых расчетах
        System.out.println(2.0 - 1.1 + " That's how we lose your money, sir"); // != 0.9

    }
}
