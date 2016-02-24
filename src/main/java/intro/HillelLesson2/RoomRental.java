package intro.HillelLesson2;

/**
 * Created by pyavchik on 14.02.16.
 */

public class RoomRental {

    public static void main(String[] args) {
        int days = 12;

        int total = days * 40;

        //for 3 days we have -20
        if (days > 3)
            total -= 20; //total = total - 20

        //for 7 days we have -50 -(20 + 30)
        if (days > 7)
            total -= 30; //total = total - 30
    }
}