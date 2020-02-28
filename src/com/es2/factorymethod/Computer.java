package com.es2.factorymethod;
import com.es2.factorymethod.Product;

public class Computer extends java.lang.Object
        implements Product {
    private String brand;
    protected Computer(){

    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
