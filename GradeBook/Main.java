package edu.fmi;

public class Main {

    public static void main(String[] args) {
        GradeBook mathCourse = new GradeBook("Petrov", 20, "Matematika");
        //mathCourse.welcomeMesage();
        System.out.println("mathCourse: " + mathCourse);

        GradeBook englishCourse = new GradeBook();
        //englishCourse.welcomeMesage();
        System.out.println("English: " + mathCourse.toString());

        GradeBook math2 = new GradeBook(mathCourse);
        math2.setCourseName("Matematica 2");
        //math2.welcomeMesage();
        System.out.println("math 2: " + math2);
    }
}
