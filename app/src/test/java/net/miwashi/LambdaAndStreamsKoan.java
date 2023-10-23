package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaAndStreamsKoan {

    @Disabled
    @Test
    @DisplayName("Understanding basic lambda syntax.")
    public void basicLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 3)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), doubled, "Hint: What operation does the lambda perform?");
    }

    @Disabled
    @Test
    @DisplayName("Using filter operation on a stream.")
    public void filterWithStreams() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> result = words.stream()
                .filter(w -> w.length() > 6)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("apple", "banana"), result, "Hint: Which words are longer than 5 characters?");
    }

    @Disabled
    @Test
    @DisplayName("Understanding the reduce operation.")
    public void reduceWithStreams() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a + b);
        assertEquals(120, product, "Hint: The reduce operation multiplies numbers together.");
    }

    @Disabled
    @Test
    @DisplayName("Using sorted operation on a stream.")
    public void sortWithStreams() {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5);
        List<Integer> sorted = numbers.stream()
                .sorted((n1, n2) -> n2 - n1)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(1, 1, 3, 4, 5), sorted, "Hint: Are numbers being sorted in ascending order?");
    }

    @Disabled
    @Test
    @DisplayName("Understanding the collect operation with toMap.")
    public void collectToMapWithStreams() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> wordLengths = words.stream()
                .collect(Collectors.toMap(w -> w, w -> w.length() * 2));
        assertEquals(Integer.valueOf(10), wordLengths.get("banana"), "Hint: The map's values are word lengths.");
    }

    // ... Additional tests can be added to explore further nuances of lambdas and streams ...

}
