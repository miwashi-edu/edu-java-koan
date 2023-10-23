package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Beverage {
    private String name;
    private int volume;

    // Default constructor
    Beverage() {
        this.name = "Water";
        this.volume = 500;  // milliliters
    }

    // Parameterized constructor
    Beverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    String getName() {
        return name;
    }

    int getVolume() {
        return volume;
    }
}

public class ConstructorKoan {

    @Disabled
    @Test
    @DisplayName("Understanding default constructors.")
    public void defaultConstructor() {
        Beverage beverage = new Beverage();
        assertEquals("Soda", beverage.getName(), "Hint: The default beverage is not soda.");
        assertEquals(1000, beverage.getVolume(), "Hint: The default volume might not be what you think.");
    }

    @Disabled
    @Test
    @DisplayName("Using parameterized constructors for customization.")
    public void parameterizedConstructor() {
        Beverage beverage = new Beverage("Tea", 250);
        assertEquals("Coffee", beverage.getName(), "Hint: We've not instantiated coffee.");
        assertEquals(300, beverage.getVolume(), "Hint: The volume was explicitly set during instantiation.");
    }

    @Disabled
    @Test
    @DisplayName("Constructors can call other constructors.")
    public void chainingConstructors() {
        // For this koan, you may need to add another constructor in Beverage that chains to a different constructor.
    }

    @Disabled
    @Test
    @DisplayName("The 'this' keyword refers to the current instance.")
    public void understandingThisKeyword() {
        // This test can be about setting and retrieving instance variables using 'this' in the Beverage class.
    }

    @Disabled
    @Test
    @DisplayName("Constructors do not have return types.")
    public void noReturnTypes() {
        // This can be more of a discussion point, possibly showing code that would not compile.
    }

    @Disabled
    @Test
    @DisplayName("Constructors can be private in a singleton pattern.")
    public void privateConstructor() {
        // For this koan, you may want to demonstrate the Singleton pattern where the constructor is private.
    }

    // ... Additional tests can be added to further explore constructors and their characteristics ...
}
