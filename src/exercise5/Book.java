package exercise5; // Defines the package name as exercise5

import java.util.ArrayList; // Imports the ArrayList class from the java.util package

public class Book {
    private String title; // Private member variable to store the title of the book
    private String author; // Private member variable to store the author of the book
    private String ISBN; // Private member variable to store the ISBN of the book
    private static ArrayList<Book> bookCollection = new ArrayList<Book>(); // Static ArrayList to hold the collection of Book objects

    // Constructor to initialize the Book object with title, author, and ISBN
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter method for the title
    public String getTitle() {
        return title;
    }

    // Setter method for the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the author
    public String getAuthor() {
        return author;
    }

    // Setter method for the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for the ISBN
    public String getISBN() {
        return ISBN;
    }

    // Static method to add a Book object to the bookCollection
    public static void addBook(Book book) {
        bookCollection.add(book);
    }

    // Static method to remove a Book object from the bookCollection
    public static void removeBook(Book book) {
        bookCollection.remove(book);
    }

    // Static method to return the bookCollection
    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
}
