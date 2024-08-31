package org.example;

import java.util.HashMap;
import java.util.Map;

public class Library
{
    private final Map<String, Book> bookCollection;

    public Library() {
        this.bookCollection = new HashMap<>();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book should not be null");
        }

        String isbn = book.getISBN();
        if (bookCollection.containsKey(isbn)) {
            throw new IllegalStateException("Book with this ISBN already exists in the library");
        }

        bookCollection.put(isbn, book);
    }
}