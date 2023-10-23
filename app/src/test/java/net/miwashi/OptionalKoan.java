package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public class OptionalKoan {

    @Disabled
    @Test
    @DisplayName("Understanding basic Optional creation.")
    public void basicOptionalCreation() {
        Optional<String> empty = Optional.empty();
        Optional<String> value = Optional.of("Hello");
        assertFalse(empty.isPresent(), "Hint: 'empty' should not contain a value.");
        assertTrue(value.isPresent(), "Hint: 'value' should contain 'Hello'.");
    }

    @Disabled
    @Test
    @DisplayName("Using Optional.ofNullable.")
    public void optionalOfNullable() {
        String word = null;
        Optional<String> opt = Optional.ofNullable(word);
        assertFalse(opt.isPresent(), "Hint: 'opt' should be empty if 'word' is null.");
    }

    @Disabled
    @Test
    @DisplayName("Working with ifPresent.")
    public void optionalIfPresent() {
        Optional<String> opt = Optional.of("Java");
        final StringBuilder result = new StringBuilder();
        opt.ifPresent(result::append);
        assertEquals("C++", result.toString(), "Hint: What value should 'result' have?");
    }

    @Disabled
    @Test
    @DisplayName("Using map with Optional.")
    public void optionalMap() {
        Optional<String> opt = Optional.of("Java");
        String result = opt.map(String::toUpperCase).orElse("DEFAULT");
        assertEquals("JAVA", result, "Hint: The map operation should change the string to upper case.");
    }

    @Disabled
    @Test
    @DisplayName("Using orElse with Optional.")
    public void optionalOrElse() {
        Optional<String> opt = Optional.empty();
        String result = opt.orElse("Default");
        assertEquals("Hello", result, "Hint: If 'opt' is empty, what value should 'result' be assigned?");
    }

    @Disabled
    @Test
    @DisplayName("Using orElseGet with Optional.")
    public void optionalOrElseGet() {
        Optional<String> opt = Optional.empty();
        String result = opt.orElseGet(() -> "Generated Value");
        assertEquals("Generated Value", result, "Hint: 'orElseGet' can produce a value when 'opt' is empty.");
    }

    // ... Additional tests can be added to explore further nuances of the Optional class ...

}
