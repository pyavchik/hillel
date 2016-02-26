package OOP.HillelHomeWorkLesson5;

import java.util.Scanner;

/**
 * Created by test on 26.02.16.
 */
public class UtilsForHomeWork5 {
    static void outputSideBRectangle(Rectangle rectangleForTask) {
        System.out.println("Side b for rectangle with perimeter " + rectangleForTask.perimeter + " and square " + rectangleForTask.square + " is: " + Rectangle.getSideBWithPerimeterAndSquare(rectangleForTask.perimeter, rectangleForTask.square));
    }

    static void outputSideARectangle(Rectangle rectangleForTask) {
        System.out.println("Side a for rectangle with perimeter " + rectangleForTask.perimeter + " and square " + rectangleForTask.square + " is: " + Rectangle.getSideAWithPerimeterAndSquare(rectangleForTask.perimeter, rectangleForTask.square));
    }

    static void setUpSquareRectangle(Scanner scanner, Rectangle rectangleForTask) {
        System.out.print("Please enter square of rectangle: ");
        rectangleForTask.setSquare(scanner.nextDouble());
        if (rectangleForTask.square <= 0) {
            System.out.println("Error! rectangle square must be more then 0");
        }
    }

    static void setUpPerimetreRectangle(Scanner scanner, Rectangle rectangleForTask) {
        System.out.print("Please enter perimeter of rectangle: ");
        rectangleForTask.setPerimeter(scanner.nextDouble());
        if (rectangleForTask.perimeter <= 0) {
            System.out.println("Error! rectangle square must be more then 0");
        }
    }
}
