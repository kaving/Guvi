package com.org;

public class BookManagementSystem {

    public static void main(String[] args) {
        // Create a library with a capacity of 5 books
        Library library = new Library(5);

        // Create some books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", true);
        Book book2 = new Book(2, "1984", "George Orwell", true);
        Book book3 = new Book(3, "To Kill a Mockingbird", "Harper Lee", true);

        // Add books to the library
        library.addBook(book1, 0);
        library.addBook(book2, 1);
        library.addBook(book3, 2);

        // Display all books in the library
        library.displayBooks();

        // Replace a book in the library
        Book newBook = new Book(4, "Brave New World", "Aldous Huxley", true);
        library.replaceBook(1, newBook);

        // Display all books in the library after replacement
        library.displayBooks();
    }
}