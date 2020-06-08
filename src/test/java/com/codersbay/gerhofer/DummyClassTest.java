package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DummyClassTest {

    @Test
    @DisplayName("When we call getAge() on the dummy class we expect it to return 27.")
    public void testGetAge() {
        DummyClass classUnderTest = new DummyClass();
        assertEquals(27, classUnderTest.getAge());
    }

    @Test
    @DisplayName("When we call doNotCall() on the dummy class we expect it to throw an IllegalAccessException")
    public void testDoNotCallThrowsException() {
        DummyClass classUnderTest = new DummyClass();
        assertThrows(IllegalAccessException.class, () -> {
            classUnderTest.doNotCall();
        });
    }

}