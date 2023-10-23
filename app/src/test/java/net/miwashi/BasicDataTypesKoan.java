package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDataTypesKoan {

    @Disabled
    @Test
    @DisplayName("Given an integer, it should match its expected value.")
    public void understandingIntegers() {
        int number = 42;
        assertEquals(0, number, "Hint: The integer value should be 42."); // student should replace 0 with 42
    }

    @Disabled
    @Test
    @DisplayName("Given a double, it should closely match its expected value.")
    public void understandingDoubles() {
        double piValue = 3.14;
        assertEquals(0.0, piValue, 0.01, "Hint: The double value represents a mathematical constant."); // student should replace 0.0 with 3.14
    }

    @Disabled
    @Test
    @DisplayName("A character should match its expected symbol.")
    public void understandingChars() {
        char letterA = 'A';
        assertEquals('B', letterA, "Hint: It's the first letter of the alphabet."); // student should replace 'B' with 'A'
    }

    @Disabled
    @Test
    @DisplayName("Booleans express truth values. True or false?")
    public void understandingBooleans() {
        boolean isJavaFun = true;
        assertEquals(false, isJavaFun, "Hint: Isn't Java fun?"); // student should replace false with true
    }

    @Disabled
    @Test
    @DisplayName("A byte has a maximum value of 127. Match it!")
    public void understandingByte() {
        byte smallNumber = 127; // maximum value of a byte
        assertEquals(0, smallNumber, "Hint: A byte's maximum value is 127."); // student should replace 0 with 127
    }
}
