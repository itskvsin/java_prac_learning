/*
 * 
 * 4. Library Management with Interfaces
Design a system for managing books in a library:
 Create an interface LibraryOperations with methods addBook(Book b), removeBook(int bookId), and
searchBook(String title).
 Implement this interface in a Library class that maintains an ArrayList<Book>.
 Use encapsulation to keep book details private.
 Demonstrate adding, removing, and searching books in the main method.
 * 
 * 
 */

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // 1.) Add Books
        System.out.println("--- Adding Books ---");
        myLibrary.addBook(new Book(101, "The Hobbit", "J.R.R. Tolkien"));
        myLibrary.addBook(new Book(102, "1984", "George Orwell"));
        myLibrary.addBook(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

        myLibrary.displayAllBooks();

        System.out.println("\n--- Searching for a Book ---");
        String searchTitle = "1984";

        Book foundBook = myLibrary.searchBook(searchTitle);
        if (foundBook == null) {
            System.out.println("Book \"" + searchTitle + "\" not found.");
        } else {
            System.out.println("Found book: " + foundBook);

        }

        System.out.println("\n--- Removing a Book ---");
        myLibrary.removeBook(102);
        myLibrary.removeBook(999);

        myLibrary.displayAllBooks();
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

interface LibraryOPerations {
    void addBook(Book b);

    void removeBook(int bookId);

    Book searchBook(String title);
}

class Library implements LibraryOPerations {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Added: " + b.getTitle());
    }

    @Override
    public void removeBook(int bookId) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Removed: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    @Override
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println("\n--- All Books in Library ---");
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}