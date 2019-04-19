package edu.softuni;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int money;
    private ArrayList<String> bagOfProducts;

    public Person(String name, int money) {
        this.setName(name);
        this.setMoney(money);
    }

    public Person(String name, int money, String bagOfProducts) {
        this.setName(name);
        this.setMoney(money);
        this.setBagOfProducts(bagOfProducts);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.contains(" ")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public ArrayList<String> getBagOfProducts()
    {
        return new ArrayList<String>(bagOfProducts);
    }

    public void setBagOfProducts(String bagOfProducts) {
        this.bagOfProducts = new ArrayList<>();
    }

    public void boughtOrNot(String name, int cost) {
        if(getMoney() - cost < 0){
             throw new IllegalArgumentException(getName()+" can't afford "+name);
        } else {
            bagOfProducts.add(name);
        }
    }
}
