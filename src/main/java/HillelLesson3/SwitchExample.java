package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class SwitchExample {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int result;

        String operation = "add";

        switch(operation) {
            case "add":
                result = a + b;
                break;
            case "substract":
                result = a - b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                System.out.println("Unknown operation");
        }

        System.out.println(a + b);

    }

}
