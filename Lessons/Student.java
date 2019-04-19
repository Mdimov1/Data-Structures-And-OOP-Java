package edu.fmi;

public class Student extends Person {
    private int fn;

    @Override
    public String toString() {
        return super.toString()+"\nStudent{" +
                "fn=" + fn +
                '}';
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, dear " + this.getName() + "!\n"+
                "You are enrolled under faculty number " + this.fn + ".";
    }

    public Student(String name, String family, int fn) {
        super(name, family);
        if(fn>0){
            this.fn = fn;
        }

    }

    public Student() {
        super();
        fn=0;
    }
    public Student(Student s) {
        super( s);
        this.fn=s.fn;
    }

    public int getFn() {
        return fn;
    }

    public void setFn(int fn) {
        if(fn>0){
            this.fn = fn;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            if (fn  > ((Student) o).fn)
                return 1;
            if (fn == ((Student) o).fn)
                return 0;
            return -1;
        }
        return -2;
    }


    //@Override
    //public String welcomeMessage(){
    //    return "Уважаеми, "+getName()+"! Записан си с факултетен номер "+fn;
    //}
}
