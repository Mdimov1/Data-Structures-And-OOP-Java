package edu.fmi;

public class TestShapes {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        if (Shapes.existsTriangle(a,b,c)){
            System.out.println("The perimeter of the triangle is " + Shapes.perimeterOfTriangle(a,b,c));
            System.out.println("The area of the triangle is " + Shapes.areaOfTriangle(a,b,c));
        }
        else{
            System.out.println("These numbers can\'t be sides of triangle");
        }


    }
}
