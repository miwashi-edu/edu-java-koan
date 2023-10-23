package net.miwashi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Animal {
    String sound() {
        return "sound";
    }
}

class Dog extends Animal {
    @Override
    String sound() {
        return "bark";
    }
}

class Cat extends Animal {
    @Override
    String sound() {
        return "meow";
    }
}

public class ObjectOrientationKoan {

    @Disabled
    @Test
    @DisplayName("Objects have behaviors defined by their methods.")
    public void understandingObjectBehavior() {
        Animal animal = new Animal();
        assertEquals("noise", animal.sound(), "Hint: The base animal makes a generic sound.");
    }

    @Disabled
    @Test
    @DisplayName("Objects can be more specific variants of another object.")
    public void understandingInheritance() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal, "Hint: A Dog is an Animal.");
    }

    @Disabled
    @Test
    @DisplayName("Specific objects have specific behaviors.")
    public void understandingPolymorphism() {
        Animal cat = new Cat();
        assertEquals("noise", cat.sound(), "Hint: Cats have a specific sound they make.");
    }

    @Disabled
    @Test
    @DisplayName("Objects can hide their internal state.")
    public void understandingEncapsulation() {
        Dog dog = new Dog();
        String sound = dog.sound();
        assertNotEquals("sound", sound, "Hint: A Dog does not make the default Animal sound.");
    }

    @Disabled
    @Test
    @DisplayName("Objects can have abstract definitions.")
    public void understandingAbstractClasses() {
        // This test will require creating an abstract class and a concrete subclass.
        // The abstract class might have an abstract method, and the subclass should implement it.
    }

    @Disabled
    @Test
    @DisplayName("Objects can define and implement multiple behaviors.")
    public void understandingInterfaces() {
        // This test will require defining an interface and a class that implements it.
    }

    @Disabled
    @Test
    @DisplayName("Overriding allows specific behaviors for subclasses.")
    public void understandingMethodOverriding() {
        Dog dog = new Dog();
        assertEquals("noise", dog.sound(), "Hint: Dogs have their own unique sound.");
    }

    @Disabled
    @Test
    @DisplayName("Objects can be typecast to reveal their true nature.")
    public void understandingTypeCasting() {
        Animal animal = new Dog();
        Dog realDog = (Dog) animal;
        assertEquals("noise", realDog.sound(), "Hint: When you see the true nature of a Dog, you'll know its sound.");
    }

    @Disabled
    @Test
    @DisplayName("Objects can be grouped by shared behaviors.")
    public void understandingPolymorphicArrays() {
        Animal[] animals = {new Dog(), new Cat()};
        assertEquals("noise", animals[0].sound(), "Hint: The first animal in the array has its own sound.");
    }

    // ... Additional tests can be added here ...

    @Disabled
    @Test
    @DisplayName("Every object is an instance of the Object class.")
    public void understandingObjectClass() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Object, "Hint: Every class in Java is a child of the Object class.");
    }

    // More tests can be added following similar patterns and focusing on
    // other aspects of Object-Oriented Programming. Additional topics to explore include method overloading,
    // constructors, 'super' keyword, etc.
}

