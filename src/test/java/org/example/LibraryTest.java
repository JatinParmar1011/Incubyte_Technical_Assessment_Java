package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

    // Test the addition of a valid Book
    public void testAddBook() {
        Book validBook = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        library.addBook(validBook);
    }
}