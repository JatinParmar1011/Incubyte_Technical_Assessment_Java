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
        String isbn = book.getISBN();
        bookCollection.put(isbn, book);
    }
}