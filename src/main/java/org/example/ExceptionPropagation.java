package org.example;

public class ExceptionPropagation {

    public static void g() throws Exception {
        throw new Exception("Exception thrown from g() method");
    }

    public static void f() throws AnotherException {
        try {
            g();
        } catch (Exception e) {
            throw new AnotherException("Exception thrown from f() method after catching g() exception", e);
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (AnotherException e) {
            System.out.println("Caught exception from f(): " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}

class AnotherException extends Exception {
    public AnotherException(String message, Throwable cause) {
        super(message, cause);
    }
}
