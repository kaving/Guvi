package com.org;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }
    
    public void addBook(Book book, int index) {
        if (index >= 0 && index < books.length) {
            books[index] = book;
        }
    }
    
    public Book getBook(int index) {
        if (index >= 0 && index < books.length) {
            return books[index];
        }
        return null;
    }

    public void displayBooks() {
        
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: " + book.isIsAvailable());
                System.out.println();
            }
        }
    }

    public void replaceBook(int index, Book newBook) {
        if (index >= 0 && index < books.length) {
            books[index] = newBook;
        }
    }

}
