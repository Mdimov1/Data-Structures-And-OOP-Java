package edu.fmi;

public abstract class Teacher extends Person {
    private String position;

    @Override
    public String toString() {
        return super.toString()+"\nTeacher{" +
                "position='" + position + '\'' +
                '}';
    }

    //@Override
    public String welcomeMessage() {
        return "Dear prof. " + getFamily() + ", " +
                "You are welcome in our researcher's community!"+position+".";
    }

    public Teacher(String name, String family, String position) {
        super(name, family);
        if(position!=null){
            this.position = position;
        }
    }


}
