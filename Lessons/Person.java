package edu.fmi;

public abstract class Person implements Comparable{
    private String name;
    private String family;


    public Person(String name, String family) {
        if((name!=null)&&(family!=null)){
            this.name = name;
            this.family = family;
        }
    }

    public Person() {
        this("","");
    }
    public Person(Person t) {
        this(t.name,t.family);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null){
            this.name = name;
        }
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        if(family!=null){
            this.family = family;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public abstract String welcomeMessage();
}
