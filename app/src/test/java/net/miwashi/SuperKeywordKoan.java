package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Fruit {
    private String type;

    Fruit(String type) {
        this.type = type;
    }

    String getType() {
        return type;
    }
}

class Apple extends Fruit {
    private String variety;

    Apple(String type, String variety) {
        super(type);  // Calls the constructor of the parent class
        this.variety = variety;
    }

    String getVariety() {
        return variety;
    }
}

public class SuperKeywordKoan {

    @Disabled
    @Test
    @DisplayName("Using super to call the parent class's constructor.")
    public void callingParentConstructor() {
        Apple apple = new Apple("Fruit", "Honeycrisp");
        assertEquals("Veggie", apple.getType(), "Hint: An apple is a type of what?");
        assertEquals("Sourcrisp", apple.getVariety(), "Hint: The variety of apple was explicitly set.");
    }

    @Disabled
    @Test
    @DisplayName("super can be used to access parent class's methods.")
    public void accessingParentMethods() {
        // Here, you might add methods in both the parent and child class where the child's method
        // uses super to call the parent's method.
    }

    @Disabled
    @Test
    @DisplayName("super() must be the first statement in a constructor.")
    public void orderOfSuper() {
        // This can be more of a discussion point, or students can experiment by trying to
        // move the super() call to a different position in the Apple constructor.
    }

    @Disabled
    @Test
    @DisplayName("Using super when parent class has multiple constructors.")
    public void multipleParentConstructors() {
        // For this test, add another constructor to the Fruit class and demonstrate using super()
        // to call a specific constructor from Apple's constructor.
    }

    // ... Additional tests can be added to further explore the nuances of the super keyword ...

}
