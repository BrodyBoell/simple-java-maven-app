package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    // A constant string message that will be printed to the console
    private static final String MESSAGE = "Hello World!";
    // Constructor for the App class
    public App() {}
    // Main method
    public static void main(String[] args) {
                // Print the message constant to the console
        System.out.println(MESSAGE);
    }
    // Method to retrieve the message string
    public String getMessage() {
        return MESSAGE;
    }
}
