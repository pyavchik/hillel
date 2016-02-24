package OOP.HillelLesson5;

/**
 * Created by oleksandrpiavchik on 24.02.16.
 */
public class Human {

    static int handsAmount = 2;

    String name;

    public static String sayHello() {
        return "Hello from whole humanity!";
    }

    public String introduce() {
        return "my name is " + name;
    }
}