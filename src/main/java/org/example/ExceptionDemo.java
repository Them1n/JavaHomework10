package org.example;
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("An example exception occurred!");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block. Clean-up code executed.");
        }
    }
}
