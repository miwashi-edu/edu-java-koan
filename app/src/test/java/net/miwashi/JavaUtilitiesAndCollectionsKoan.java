package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class JavaUtilitiesAndCollectionsKoan {

    @Disabled
    @Test
    @DisplayName("Using ArrayList for dynamic arrays.")
    public void arrayListBasics() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        assertEquals(3, list.size(), "Hint: How many elements were added to the list?");
    }

    @Disabled
    @Test
    @DisplayName("Using HashSet to store unique elements.")
    public void hashSetBasics() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        assertEquals(3, set.size(), "Hint: Remember, sets don't allow duplicate elements.");
    }

    @Disabled
    @Test
    @DisplayName("Using HashMap to store key-value pairs.")
    public void hashMapBasics() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        assertEquals(Integer.valueOf(3), map.get("two"), "Hint: What value did 'two' map to?");
    }

    @Disabled
    @Test
    @DisplayName("Using Arrays utility class.")
    public void arraysUtility() {
        int[] numbers = {3, 1, 4, 1, 5};
        Arrays.sort(numbers);
        assertEquals(3, numbers[0], "Hint: Arrays.sort() sorts the array in ascending order.");
    }

    @Disabled
    @Test
    @DisplayName("Using Collections utility class.")
    public void collectionsUtility() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));
        Collections.sort(numbers);
        assertEquals(3, numbers.get(0).intValue(), "Hint: Collections.sort() sorts the list in ascending order.");
    }

    @Disabled
    @Test
    @DisplayName("Understanding the Comparable interface.")
    public void usingComparable() {
        // Here you could have a custom class that implements Comparable
        // And then sort an array or list of that class objects.
    }

    @Disabled
    @Test
    @DisplayName("Understanding the Comparator interface.")
    public void usingComparator() {
        // Here you could have a custom class and use a Comparator to sort based on different criteria.
    }

    // ... Additional tests can be added to explore further nuances of utilities and collections ...

}
