package edu.exerciseTwo;

public class ListyIterator<T> implements Iterable {
    private T[] list;
    private int index;

    public ListyIterator(T... items) {
        this.list = items;
    }

    @Override
    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }

        return false;
    }

    @Override
    public boolean hasNext() {
        if (list != null) {
            return this.index < this.list.length - 1;
        } else {
            return false;
        }
    }


    @Override
    public void print() {
        if(list.length > 0 && index < list.length) {
            System.out.println(list[index]);
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    @Override
    public void printAll() {
        for (T str: list) {
            System.out.printf("%s ", str);
        }
        System.out.println();
    }
}
