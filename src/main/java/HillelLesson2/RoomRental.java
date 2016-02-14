package HillelLesson2;

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
        System.out.println("Please enter number of days you need a flat: ");

        int intDaysOfRent;

        short rentCost = 40;
        short discountMoreThenThreeDays = 20;
        short discountMoreThenSevenDays = 50;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            intDaysOfRent = Integer.parseInt(reader.readLine());

            if (intDaysOfRent <= 0){

                System.out.println("Maybe wrong number... Please try again!");

            } else if (intDaysOfRent <= 3) {

                System.out.println("Room costs - 40$ per day");
                System.out.println("Please pay: " + (intDaysOfRent * rentCost) + " $");

            } else if (intDaysOfRent >= 3 && intDaysOfRent <= 7) {

                System.out.println("Room costs 40$ per day, and - 20 $ discount ");
                System.out.println("Please pay: " + (((intDaysOfRent * rentCost) - discountMoreThenThreeDays)) + " $");

            } else {

                System.out.println("Room costs 40$ per day, and - 50 $ discount ");
                System.out.println("Please pay: " + (((intDaysOfRent * rentCost) - discountMoreThenSevenDays)) + " $");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}