package edu.exerciseone;


import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public List<T> getBox() {
        return box;
    }

    private T getElement(int index){
        return box.get(index);
    }

    public void addElement(T element){
        box.add(element);
    }

    public int compareTo(T element){
        int counter = 0;

        for (int i = 0; i < box.size(); i++) {
            int cmp = element.compareTo(getElement(i));
            if(cmp < 0){
            counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(box.getClass().getName()).append(String.format(": %s",box));
        return sb.toString();
    }
}
