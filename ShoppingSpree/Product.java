package edu.softuni;

public class Product {
    private String nameOfProduct;
    private int costOfProduct;

    public Product(String nameOfProduct, int costOfProduct) {
        this.setNameOfProduct(nameOfProduct);
        this.setCostOfProduct(costOfProduct);
    }

    public String getNameOfProduct() {
        return this.nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        if (nameOfProduct == null || nameOfProduct.isEmpty() || nameOfProduct.contains(" ")){
            throw new IllegalArgumentException("Name of product cannot be empty");
        }
        this.nameOfProduct = nameOfProduct;
    }

    public int getCostOfProduct() {
        return costOfProduct;
    }

    public void setCostOfProduct(int costOfProduct) {
        if (costOfProduct <= 0){
            throw new IllegalArgumentException("Cost of product cannot be negative");
        }
        this.costOfProduct = costOfProduct;
    }
}
