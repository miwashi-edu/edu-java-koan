package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringsAndArraysKoan {

    @Disabled
    @Test
    @DisplayName("Understanding basic String operations.")
    public void basicStringOperations() {
        String hello = "Hello";
        String world = "World";
        assertEquals("Hello World", hello + " " + world, "Hint: Are the strings being concatenated correctly?");
    }

    @Disabled
    @Test
    @DisplayName("Exploring String immutability.")
    public void stringImmutability() {
        String original = "Java";
        original.toUpperCase();
        assertEquals("JAVA", original, "Hint: Remember, Strings in Java are immutable.");
    }

    @Disabled
    @Test
    @DisplayName("Working with substrings.")
    public void substrings() {
        String text = "JavaRocks";
        String sub = text.substring(0, 3);
        assertEquals("Java", sub, "Hint: Check the start and end indices for substring.");
    }

    @Disabled
    @Test
    @DisplayName("Understanding basic array operations.")
    public void basicArrayOperations() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3, numbers[1], "Hint: Remember, array indices start from 0.");
    }

    @Disabled
    @Test
    @DisplayName("Exploring array lengths.")
    public void arrayLength() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(4, numbers.length, "Hint: How many elements are in the array?");
    }

    @Disabled
    @Test
    @DisplayName("Working with multi-dimensional arrays.")
    public void multiDimensionalArrays() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(6, matrix[1][2], "Hint: Access the correct row and column.");
    }

    @Disabled
    @Test
    @DisplayName("Understanding array cloning.")
    public void arrayCloning() {
        int[] original = {1, 2, 3, 4, 5};
        int[] clone = original.clone();
        clone[0] = 100;
        assertEquals(1, original[0], "Hint: Changing the cloned array should not affect the original.");
    }

    // ... Additional tests can be added to explore further nuances of strings and arrays ...

}

