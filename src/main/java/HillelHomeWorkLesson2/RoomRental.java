package HillelHomeWorkLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by test on 14.02.16.
 */

/*
Room costs 40 dollars per day
for more than 7 days we have a discount of 50 dollars
for more than 3 days we have a discount of 20 dollars
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