package javaclassesandinterfacestask.ClassesAndInterfaceTask_Maryam;

import java.util.ArrayList;

public class LibrarySystem {
    public static void displayUserDetails(User user){

        System.out.println("User Name" + user.getName());
        System.out.println("Library ID" + user.getLibraryId());
        if (user instanceof Librarian){
            System.out.println("Employee ID:" + ((Librarian) user).getEmployeeId());
        }
        System.out.println("Books Borrowed:" + user.getBooksBorrowed().size());
        for (Book book : user.getBooksBorrowed()){
            System.out.println("-" + book.getTitle() + "by" + book.getAuthor());
        }
    }

    public static void main(String[] args) {

        ArrayList<Book> catalog = new ArrayList<>();
        //books creation
        Book book1 = new Book("Book One", "Author One", "ISBN001");
        Book book2 = new Book("Book Two", "Author Two", "ISBN002");
        Book book3 = new Book("Book Three", "Author Three", "ISBN003");
        // Create Users
        User user = new User("John Doe", "USER001");
        Librarian librarian = new Librarian("Jane Smith", "USER002", "EMP001");

        // Add books to catalog
        librarian.addBook(catalog, book1);
        librarian.addBook(catalog, book2);
        librarian.addBook(catalog, book3);

        // Borrow and return books
        System.out.println("\nBorrowing Book One by John Doe:");
        user.borrowBook(book1);

        System.out.println("\nBorrowing Book Two by John Doe:");
        user.borrowBook(book2);


        System.out.println("\nReturning Book One by John Doe:");
        user.returnBook(book1);

        // Display details
        System.out.println("\nUser Details:");
        displayUserDetails(user);
        System.out.println("\nLibrarian Details:");
        displayUserDetails(librarian);
        System.out.println("\nCatalog Status:");
        for (Book book : catalog) {
            System.out.println(book.toString() + " - " + (book.isAvailable() ? "Available" : "Borrowed"));
        }
    }
}
