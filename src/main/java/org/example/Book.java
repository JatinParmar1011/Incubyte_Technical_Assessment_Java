package org.example;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(String isbn, String title, String author, int publicationYear) {
        validateMandatoryFields(isbn, title, author, publicationYear);

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private void validateText(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    private void validateMandatoryFields(String isbn, String title, String author, int publicationYear) {
        validateText(isbn, "ISBN should not be null or empty");
        validateText(title, "Title should not be null or empty");
        validateText(author, "Author should not be null or empty");
        if (publicationYear <= 0) {
            throw new IllegalArgumentException("Publication year should be a positive integer");
        }
    }
}
