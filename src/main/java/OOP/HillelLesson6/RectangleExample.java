package OOP.HillelLesson6;

/**
 * Created by test on 29.02.16.
 */
public class RectangleExample {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.heigth = 2;
        firstRectangle.width = 3;
        firstRectangle.color = "Red";

        firstRectangle.calculateArea();
        System.out.println(firstRectangle.calculateArea());

        System.out.println(firstRectangle.calculateSquare());

    }
}
