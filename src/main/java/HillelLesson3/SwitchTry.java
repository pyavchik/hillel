package HillelLesson3;

/**
 * Created by User on 16.02.2016.
 */
public class SwitchTry {
    public static void main(String[] args) {
        int amount = 100;
        String rating = "great";
        switch(rating) {
            case "terible":
                amount = amount * 1;
                break;
            case "good":
                amount = amount + (int) (amount * 0.05);
                break;
            case "nice":
                amount = amount + (int) (amount * 0.10);
                break;
            case "great":
                amount = amount + (int) (amount * 0.10);
                break;
            default:
                System.out.println("Unknown operation");
        }

        System.out.println(amount);

    }
}
