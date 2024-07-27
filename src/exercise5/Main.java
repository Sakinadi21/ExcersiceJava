package exercise5; // Defines the package name as exercise5

public class Main {
    public static void main(String[] args) {
        // Create a new Book object with the title "The C Programming Language", author "Dennis Ritchie", and ISBN "87987645"
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie", "87987645");

        // Print details of book1
        System.out.println("Book 1 details:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());

        // Add book1 to the bookCollection
        Book.addBook(book1);

        // Create a new Book object with the title "Data Structure and Algorithm", author "Leo", and ISBN "87-E87645"
        Book book2 = new Book("Data Structures and Algorithms", "Leo", "87-E87645");

        // Print details of book2
        System.out.println("Book 2 details:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("ISBN: " + book2.getISBN());

        // Add book2 to the bookCollection
        Book.addBook(book2);

        // Create a new Book object with the title "Java Programming", author "Meo", and ISBN "4587-E876SD45"
        Book book3 = new Book("Java Programming", "Meo", "4587-E876SD45");

        // Print details of book3
        System.out.println("Book 3 details:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("ISBN: " + book3.getISBN());

        // Add book3 to the bookCollection
        Book.addBook(book3);

        // Print the entire book collection
        System.out.println("\nBook collection:");
        for (Book book : Book.getBookCollection()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}



