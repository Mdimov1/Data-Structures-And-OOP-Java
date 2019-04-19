package edu.fmi;

public class GradeBook {
    private String teacher;
    private int hours;
    private String courseName;

    public void welcomeMesage() {
        System.out.println("Dobre doshul v kursa!" + "Zapisanite ste pri " + teacher + " chasa sedmichno - " + this.hours + " v kursa po " + courseName);
    }

    public GradeBook(String teacher, int hours, String courseName) {
        if ((teacher != null) && (hours > 0) && (courseName != null)) {
            this.teacher = teacher;
            this.hours = hours;
            this.courseName = courseName;
        }
        else {
            this.teacher = "";
            this.hours = 0;
            this.courseName = "";
        }
    }
    public GradeBook(){
        this("",0,"");
    }
    public GradeBook(GradeBook gb)
    {
        this(gb.teacher,gb.hours,gb.courseName);
    }
    public String getTeacher()
    {
        return teacher;
    }
    public void setTeacher(String teacher)
    {
        if (teacher != null)
            this.teacher = teacher;
    }
    public int getHours()
    {
        return hours;
    }
    public void setHours(int hours){
        if (hours > 0)
            this.hours = hours;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        if (courseName != null)
            this.courseName = courseName;
    }

    @Override
    public String toString(){
        return String.format("GradeBook(teacher: %s, hours: %d, course name: %s", teacher, hours, courseName);
    }
}
