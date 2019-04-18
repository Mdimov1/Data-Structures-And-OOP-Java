package edu.fmi;

public class Shapes {
    public static boolean existTriangle(double a, double b, double c) {
        return (a > 0) && (b > 0) && (c > 0) && (a + b > c) &&
                (a + c > b) && (b + c > a);
    }

    public static double perimeterOfTriangle(double a, double b, double c) {
        return a + b + c;
    }

    public static double areaOfTriangle(double a, double b, double c) {
        double p = perimeterOfTriangle(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean existRectangle(double a, double b) {
        return (a > 0) && (b > 0);
    }

    public static double perimeterOfRecktangle(double a, double b) {
        return a * 2 + b * 2;
    }

    public static double areaOfRecktangle(double a, double b) {
        return a * b;
    }

    public static boolean existOfCircle(double r) {
        return r > 0;
    }

    public static double perimeterOfCircle(double r) {
        return 2 * Math.PI * r;
    }

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
}
