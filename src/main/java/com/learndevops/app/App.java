package com.learndevops.app;

/**
 * A simple application that prints a message to the console.
 */
public class App {

    private static final String MESSAGE = 
        "Hello From Injeti Harsha Sandeep, You are here to master your skills.\n" +
        "More you share, More you gain. Happy Learning and happy sharing. This is the updated webhook.";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}

