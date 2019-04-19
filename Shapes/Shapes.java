package edu.fmi;

public class Shapes {
    public static boolean existsTriangle(double a, double b, double c){
        return (a > 0) && (b > 0) && (c > 0) &&
                (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double perimeterOfTriangle(double a, double b, double c){
        return a + b + c;
    }

    public static double areaOfTriangle(double a, double b, double c){
        double p = perimeterOfTriangle(a, b, c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
