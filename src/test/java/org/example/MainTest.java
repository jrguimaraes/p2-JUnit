package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSumCorrect() {
        assertEquals(5, Main.sum(2, 3));
    }

    @Test
    public void testSumWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Main.sum(-1, 3));
    }
}
