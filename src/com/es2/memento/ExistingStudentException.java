package com.es2.memento;

public class ExistingStudentException extends java.lang.Exception {

    private static final long serialVersionUID = 1L;

    public ExistingStudentException() {
    }

    public ExistingStudentException(String message) {
        super(message);
    }

    public ExistingStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExistingStudentException(Throwable cause) {
        super(cause);
    }

    public ExistingStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
