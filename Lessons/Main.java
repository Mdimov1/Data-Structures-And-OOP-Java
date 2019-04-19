package edu.fmi;

public class Main {

    public static void main(String[] args) {
/*        Person pesho=new Person("Pesho","Ivanov");
        System.out.println(pesho.toString());
        Person gosho=new Person("gosho","goshov");
        System.out.println(gosho);*/

        Student ivan=new Student("Ivan","Ivanov",5);
        System.out.println(ivan);
        Student stavri=new Student();
        System.out.println(stavri);

        Student copy=new Student(ivan);
        System.out.println(copy);
        System.out.println(ivan.getName());
        copy.setName("Stavri");
        copy.setFn(6);
        System.out.println(copy);

        if(ivan.compareTo(stavri)<1){
            System.out.println(ivan);
            System.out.println(stavri);
        }
        else
        {
            System.out.println(stavri);
            System.out.println(ivan);
        }

        Teacher mathTeacher= new Teacher("Georgi", "Georgiev", "Profesor") {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        System.out.println(mathTeacher);

        Person newStaff=ivan;
        System.out.println(newStaff);
        System.out.println(newStaff.welcomeMessage());

        newStaff=mathTeacher;
        System.out.println(newStaff);
        System.out.println(newStaff.welcomeMessage());

    }
}
