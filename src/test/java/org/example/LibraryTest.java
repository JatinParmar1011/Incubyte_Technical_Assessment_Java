package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

    @Test
    public void testAddBook() {
        // 1. Test case for addition of a valid Book
        Book validBook = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        library.addBook(validBook);

        // 2. Test case for adding a null book
        Exception exception = assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
        assertEquals("Book should not be null", exception.getMessage());
    }
}