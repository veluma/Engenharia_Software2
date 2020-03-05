package com.es2.memento;

public class NotExistingSnapshotException extends java.lang.Exception {

    private static final long serialVersionUID = 1L;

    public NotExistingSnapshotException() {
    }

    public NotExistingSnapshotException(String message) {
        super(message);
    }

    public NotExistingSnapshotException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotExistingSnapshotException(Throwable cause) {
        super(cause);
    }

    public NotExistingSnapshotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
