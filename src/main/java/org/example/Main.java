package org.example;

public class Main {
    public static int sum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Números negativos não são permitidos.");
        }
        return a + b;
    }
}
