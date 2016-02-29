package OOP.HillelLesson6;

/**
 * Created by test on 29.02.16.
 */
public class Rectangle {
    static int sides = 4;

    int width;
    int heigth;
    String color;

    public int calculateArea() {
        return width * heigth;
    }

    public int calculateSquare() {
        return 2 * width + 2 * heigth;
    }

}
