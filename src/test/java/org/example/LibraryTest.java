package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

public class LibraryTest {
    Library library = new Library();

    @Test
    public void testAddBook() {
        // 1. Test case for addition of a valid Book
        Book validBook = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        library.addBook(validBook);

        // 2. Test case for adding a null book
        Exception exception = assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
        assertEquals("Book should not be null", exception.getMessage());

        // 3. Test case for adding a book with duplicate ISBN
        Book duplicateBook = new Book("9788173711466", "Another Book", "Another Author", 2024);
        Exception duplicateException = assertThrows(IllegalStateException.class, () -> library.addBook(duplicateBook));
        assertEquals("Book with this ISBN already exists in the library", duplicateException.getMessage());
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        library.addBook(book);

        // 1. Borrowing book here
        library.borrowBook(book.getISBN());

        // 2. Attempt to borrow the same book again
        IllegalStateException exception1 = assertThrows(IllegalStateException.class, () -> library.borrowBook(book.getISBN()));
        assertEquals("Book is already borrowed", exception1.getMessage());

        // 3. Attempt to borrow a non-existent book
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> library.borrowBook("544554545445"));
        assertEquals("Book not found", exception2.getMessage());

        // 4. Attempt to borrow with null or empty ISBNs
        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> library.borrowBook(null));
        assertEquals("ISBN cannot be null or empty", exception3.getMessage());

        IllegalArgumentException exception4 = assertThrows(IllegalArgumentException.class, () -> library.borrowBook(""));
        assertEquals("ISBN cannot be null or empty", exception4.getMessage());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("9788173711466", "Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        library.addBook(book);

        // 1. Borrow the book and then return it
        library.borrowBook(book.getISBN());
        library.returnBook(book.getISBN());

        // 2. Attempt to return a book that was never borrowed
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> library.returnBook("544554545445"));
        assertEquals("Book was not borrowed", exception2.getMessage());

        // 3. trying to return book with null or empty ISBNs
        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> library.returnBook(null));
        assertEquals("ISBN cannot be null or empty", exception3.getMessage());

        IllegalArgumentException exception4 = assertThrows(IllegalArgumentException.class, () -> library.returnBook(""));
        assertEquals("ISBN cannot be null or empty", exception4.getMessage());
    }

    @Test
    public void testViewAvailableBooks() {
        // Add  Books to the library
        Book book1 = new Book("9788172234980", "The White Tiger", "Aravind Adiga", 2008);
        Book book2 = new Book("9780670089130", "The Ministry of Utmost Happiness", "Arundhati Roy", 2017);

        library.addBook(book1);
        library.addBook(book2);

        // viewing available book after adding books in library
        System.out.println("Available book after adding books in library");
        library.viewAvailableBooks();

        // viewing available book after borrowing one books from library
        library.borrowBook(book1.getISBN());
        System.out.println("\nAvailable book after borrowing one book from library");
        library.viewAvailableBooks();

        // viewing available book after returning borrowed book to library
        library.returnBook(book1.getISBN());
        System.out.println("\nAvailable book after returning borrowed book to library  ");
        library.viewAvailableBooks();
    }
}