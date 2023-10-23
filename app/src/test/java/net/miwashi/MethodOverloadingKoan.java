package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a.concat(b);
    }
}

public class MethodOverloadingKoan {

    @Disabled
    @Test
    @DisplayName("Method overloading allows different method parameter types.")
    public void addingDifferentTypes() {
        Calculator calculator = new Calculator();

        int integerSum = calculator.add(2, 3);
        assertEquals(0, integerSum, "Hint: 2 + 3 = ?");

        double doubleSum = calculator.add(2.5, 3.5);
        assertEquals(0.0, doubleSum, 0.01, "Hint: 2.5 + 3.5 = ?");

        String stringConcat = calculator.add("Java", "Koan");
        assertEquals("", stringConcat, "Hint: \"Java\" + \"Koan\" = ?");
    }

    @Disabled
    @Test
    @DisplayName("Method overloading allows different number of parameters.")
    public void addingMultipleNumbers() {
        // This test will require updating the Calculator class to handle multiple numbers.
        // Implement an add method in Calculator that takes three integers and returns their sum.
    }

    @Disabled
    @Test
    @DisplayName("Overloaded methods can have different return types.")
    public void differentReturnTypes() {
        // This test will require creating a method in Calculator that takes a number and returns its string representation.
    }

    @Disabled
    @Test
    @DisplayName("Method overloading is not about return types.")
    public void understandingReturnTypes() {
        // This test can be used to debunk a common misconception.
        // Create two methods in Calculator with the same parameters but different return types.
        // This won't compile, and the lesson here is that overloading is not about return types.
    }

    @Disabled
    @Test
    @DisplayName("Order of parameters is crucial in method overloading.")
    public void understandingParameterOrder() {
        // This test can demonstrate that changing the order of parameters is a valid way to overload methods.
        // Implement two methods in Calculator, one that takes (int, double) and another (double, int).
    }

    // ... Additional tests can be added to explore further nuances of method overloading ...
}