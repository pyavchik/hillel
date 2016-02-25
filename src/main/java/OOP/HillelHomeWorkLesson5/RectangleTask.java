package OOP.HillelHomeWorkLesson5;

import java.util.Scanner;

/**
 * Created by test on 24.02.16.
 */
public class RectangleTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangleForTask = new Rectangle();

        UtilsForHomeWork5.setUpPerimetreRectangle(scanner, rectangleForTask);
        UtilsForHomeWork5.setUpSquareRectangle(scanner, rectangleForTask);

        UtilsForHomeWork5.outputSideARectangle(rectangleForTask);
        UtilsForHomeWork5.outputSideBRectangle(rectangleForTask);

    }

}
