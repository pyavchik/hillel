package OOP.HillelHomeWorkLesson5;

/**
 * Created by oleksandrpiavchik on 24.02.16.
 */
public class Rectangle {

    double sideA;
    double sideB;
    double square;
    double perimeter;


    public void init() {

    }

    public void init(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public static double getPerimeterWithSideASideB(double sideA, double sideB) {

        return 2 * sideA + 2 * sideB;
    }

    public static double getSquareWithSideASideB(double sideA, double sideB) {
        return sideA * sideB;
    }

    public static double getSideAWithPerimeterAndSquare(double perimeter, double square) {

        return (((perimeter / 2) + (Math.sqrt(((perimeter / 2) * (perimeter / 2) - 4 * square))))) / 2;

    }

    public static double getSideBWithPerimeterAndSquare(double perimeter, double square) {

        return (((perimeter / 2) - (Math.sqrt(((perimeter / 2) * (perimeter / 2) - 4 * square))))) / 2;

    }

}
