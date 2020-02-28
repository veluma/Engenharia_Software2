package com.es2.factorymethod;

public class UndefinedProductException extends java.lang.Exception{
    private static final long serialVersionUID = 1L;

    public UndefinedProductException() {
    }

    public UndefinedProductException(String message) {
        super(message);
    }

    public UndefinedProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndefinedProductException(Throwable cause) {
        super(cause);
    }

    public UndefinedProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
