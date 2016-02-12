import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 12.02.2016.
 */
public class RoomRental {
    public static void main(String[] args) {
        System.out.println("Please enter number of days you need a flat: ");
        int intDays;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            intDays = Integer.parseInt(reader.readLine());

            if (intDays <= 0){
                System.out.println("Maybe wrong number... Please try again!");
            } else if (intDays < 3) {
                System.out.println("Price for you - 40$ per day");
                System.out.println("Please pay: " + (intDays * 40) + " $");
            } else if (intDays >= 3 && intDays <= 7) {
                System.out.println("Price for you 40$ per day, and - 20 $ at all ");
                System.out.println("Please pay: " + (((intDays * 40) - 20)) + " $");
            } else {
                System.out.println("Price for you 40$ per day, and - 40 $ at all ");
                System.out.println("Please pay: " + (((intDays * 40) - 40)) + " $");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
