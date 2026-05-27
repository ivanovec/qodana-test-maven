package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Qodana!");

        // Intentional issue: unused variable
        int unusedVariable = 42;

        // Intentional issue: potential NPE
        String text = null;
        if (Math.random() > 0.5) {
            text = "test";
        }
        System.out.println(text.length());
    }
}
