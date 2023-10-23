package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlStructuresKoan {

    @Disabled
    @Test
    @DisplayName("Understanding basic if-else statements.")
    public void basicIfElse() {
        int number = 5;
        String result;
        if (number > 10) {
            result = "big";
        } else {
            result = "small";
        }
        assertEquals("medium", result, "Hint: Consider the value of 'number' and the conditions.");
    }

    @Disabled
    @Test
    @DisplayName("Using loops: The for loop.")
    public void forLoopBasics() {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        assertEquals(15, sum, "Hint: Sum of first 5 natural numbers.");
    }

    @Disabled
    @Test
    @DisplayName("Using loops: The while loop.")
    public void whileLoopBasics() {
        int counter = 5;
        int decrementValue = 0;
        while (counter > 0) {
            decrementValue += 2;
            counter--;
        }
        assertEquals(5, decrementValue, "Hint: How many times is the decrementValue incremented?");
    }

    @Disabled
    @Test
    @DisplayName("Using loops: The do-while loop.")
    public void doWhileLoopBasics() {
        int counter = 0;
        do {
            counter++;
        } while (counter < 5);
        assertEquals(4, counter, "Hint: How many iterations does the loop make?");
    }

    @Disabled
    @Test
    @DisplayName("Using the switch statement.")
    public void switchStatementBasics() {
        char grade = 'B';
        String result;
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Good";
                break;
            case 'C':
                result = "Average";
                break;
            default:
                result = "Invalid grade";
        }
        assertEquals("Superb", result, "Hint: What does a 'B' grade correspond to?");
    }

    @Disabled
    @Test
    @DisplayName("Understanding the break statement in loops.")
    public void usingBreak() {
        int counter = 0;
        while (true) {
            if (counter == 5) {
                break;
            }
            counter++;
        }
        assertEquals(10, counter, "Hint: Where does the loop break?");
    }

    @Disabled
    @Test
    @DisplayName("Using the continue statement in loops.")
    public void usingContinue() {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        assertEquals(6, sum, "Hint: Sum of first 5 odd natural numbers.");
    }

    // ... Additional tests can be added to explore further nuances of control structures ...
}
