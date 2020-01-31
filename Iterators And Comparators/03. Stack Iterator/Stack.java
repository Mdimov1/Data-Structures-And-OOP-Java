package edu.exerciseTwo;

public class Stack<Integer> implements Iterable {
    private int[] list;

    public Stack(int... items) {
        this.list = items;
    }

    @Override
    public void pop() {
        this.list = slice(0, list.length - 1);
    }

    @Override
    public void push(int num) {
        int[] newList = new int[list.length + 1];

        for (int i = 0; i < newList.length; i++) {
            if (i == newList.length - 1) {
                newList[i] = num;
            } else {
                newList[i] = this.list[i];
            }
        }
        this.list = newList;
    }

    private int[] slice(int startIndex, int finalIndex) {
        try {
            int[] slicedList = new int[finalIndex - startIndex];

            for (int i = 0; i < slicedList.length; i++) {
                slicedList[i] = list[startIndex];
                startIndex++;
            }
            return slicedList;
        } catch (Exception e) {
            System.out.println();
            System.out.println("No elements");
            return this.list;
        }
    }

    public void printAll() {
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
