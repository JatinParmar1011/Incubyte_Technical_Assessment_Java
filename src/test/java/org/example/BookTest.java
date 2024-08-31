package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    // Create a Book instance
    Book wingsOfFire = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);

    // Test to ensure the ISBN is not null
    @Test
    public void validateISBNIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book(null, "Wings of Fire", "A.P.J. Abdul Kalam", 1999));
        assertEquals("ISBN should not be null or empty", exception.getMessage());
    }

    // Test to ensure the ISBN is not empty
    @Test
    public void validateISBNIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("", "Wings of Fire", "A.P.J. Abdul Kalam", 1999));
        assertEquals("ISBN should not be null or empty", exception.getMessage());
    }

    // Test to ensure the title is not null
    @Test
    public void validateTitleIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9788173711466", null, "A.P.J. Abdul Kalam", 1999));
        assertEquals("Title should not be null or empty", exception.getMessage());
    }

    // Test to ensure the title is not empty
    @Test
    public void validateTitleIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9788173711466", "", "A.P.J. Abdul Kalam", 1999));
        assertEquals("Title should not be null or empty", exception.getMessage());
    }

    // Test to ensure the author name is not null
    @Test
    public void validateAuthorIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9788173711466", "Wings of Fire", null, 1999));
        assertEquals("Author should not be null or empty", exception.getMessage());
    }

    // Test to ensure the author name is not empty
    @Test
    public void validateAuthorIsEmpty() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9788173711466", "Wings of Fire", "", 1999));
        assertEquals("Author should not be null or empty", exception.getMessage());
    }

    // Test to ensure the publication year is positive
    @Test
    public void validatePublicationYearIsNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", -1999));
        assertEquals("Publication year should be a positive integer", exception.getMessage());
    }
}