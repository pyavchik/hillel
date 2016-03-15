package HomeWorkOOP.HillelHomeWorkLesson5;

/**
 * Created by test on 24.02.16.
 */
public class RectangleTask {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        double perimeter = 42;
        double square = 108;

        getRectangleSidesWithSquareAndPerimeter(rectangle, perimeter, square);

        System.out.println(rectangle.sideA);
        System.out.println(rectangle.sideB);

    }

    private static void getRectangleSidesWithSquareAndPerimeter(Rectangle rectangle, double perimeter, double square) {
        double x;
        double y;
        double discriminant;

        double halfPerimeter = perimeter / 2;

        discriminant = (Math.pow(halfPerimeter, 2)) - (4 * 1 * square);

        if (discriminant > 0) {

            x = (halfPerimeter - Math.sqrt(discriminant)) / 2;
            rectangle.sideA = x;

            y = (halfPerimeter + Math.sqrt(discriminant)) / 2;
            rectangle.sideB = y;

        } else if (discriminant == 0) {

            x = (halfPerimeter + Math.sqrt(discriminant)) / 2;
            rectangle.sideA = x;

            y = (halfPerimeter + Math.sqrt(discriminant)) / 2;
            rectangle.sideB = y;

        } else {

            System.out.println("Maybe wrong data entered!");

        }
    }

}
