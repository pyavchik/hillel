/**
 * Created by User on 12.02.2016.
 */
public class Appartmans {
    public static void main(String[] args) {

        int days = 2;

        if (days < 3) {
            System.out.println("40$ per day");
        }

        if (days >= 3 && days <= 7) {
            System.out.println("40$ per day, and - 20 $ at all ");
        }

        if (days > 7) {
            System.out.println("40$ per day, and - 40 $ at all ");
        }
    }
}
