# Kata: Library Management System

Discover my approach to developing the Library Management System, where I applied Test-Driven Development (TDD) to ensure a robust and well-organized solution. This repository showcases a methodical, step-by-step process with a focus on achieving both clarity and efficiency in the code.

- [Objective](#Objective)
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Test Coverage](#test-coverage)

## Objective

Create a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.

### Requirements

- **Add Books**:
  - Users should be able to add new books to the library.
  - Each book should have a unique identifier (e.g., ISBN), title, author, and publication year.

- **Borrow Books**:
  - Users should be able to borrow a book from the library.
  - The system should ensure that the book is available before allowing it to be borrowed.
  - If the book is not available, the system should raise an appropriate error.

- **Return Books**:
  - Users should be able to return a borrowed book.
  - The system should update the availability of the book accordingly.

- **View Available Books**:
  - Users should be able to view a list of all available books in the library.

## Overview
This project adopts a Test-Driven Development (TDD) approach to create a comprehensive solution for the library management system. Each feature is meticulously developed and tested through incremental commits, showcasing a disciplined adherence to TDD methodologies.

## Features

#### `addBook`
- Validates the book to ensure it’s not null.
- Prevents the addition of books with existing ISBNs to avoid duplication.

#### `borrowBook`
- Empowers users to borrow books.
- Ensures the book is not already borrowed and exists in the inventory.
- Throws exceptions for attempts to borrow unavailable books.

#### `returnBook`
- Manages the return process of borrowed books.
- Reinforces the integrity of the inventory by accepting only legitimately borrowed books.

#### `viewAvailableBooks`
- Displays a curated list of all currently available books in the library, ensuring transparency and ease of access.

## Project Structure

The project consists of the following main classes:

- `Library`: Manages the collection of books and operations like adding, borrowing, and returning books.
- `Book`: Represents a book with properties like ISBN, title, author, and publication year.

Test classes:

- `LibraryTest`: Contains unit tests for the `Library` class.
- `BookTest`: Contains unit tests for the `Book` class.

## Getting Started

### System Requirements

Before you begin, ensure that your development environment meets the following requirements:
- JDK 11 or higher
- Maven (for building the project)
- JUnit 5 (for running tests)

### Clone the Project

1. Open your terminal or command-line tool of choice.
2. Run the following command to download the repository:
   
```bash
git clone (https://github.com/JatinParmar1011/Incubyte_Technical_Assessment_Java)
```

## Test Coverage
![test](https://github.com/user-attachments/assets/fda5e61e-516c-41be-a70e-865f71ececee)
