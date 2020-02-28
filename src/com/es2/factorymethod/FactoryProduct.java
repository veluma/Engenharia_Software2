package com.es2.factorymethod;

public abstract class FactoryProduct extends java.lang.Object {
    public FactoryProduct() {
    }

    public static Product makeProduct(String product) throws UndefinedProductException {
        switch (product.toLowerCase()) {
            case "computer":
                return new Computer();
            case "software":
                return new Software();
            default:
                throw new UndefinedProductException();
        }
    }
}
