package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSum() {
        assertEquals(5, Main.sum(2, 3));
    }
}