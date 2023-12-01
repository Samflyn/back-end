package org.example;

public class Greeting {

    private static final String HELLO = "HELLO";
    private static final String WORLD = "WORLD";

    public String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public String helloName(String name) {
        return HELLO + " " + name;
    }

    public String exception(boolean throwException) {
        if (throwException) throw new IllegalStateException("Some error occurred");
        return "EXCEPTION";
    }
}
