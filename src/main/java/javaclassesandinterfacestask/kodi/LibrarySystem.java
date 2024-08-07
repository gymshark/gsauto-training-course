package javaclassesandinterfacestask.kodi;

import java.util.ArrayList;

public class LibrarySystem {

  public static void main(String[] args) {
    // Create an array for book catalog
    ArrayList<Book> catalog = new ArrayList<>();

    // Create books
    Book book1 = new Book("Muhammad Ali Biography", "Muhammad Ali", "TEST1234");
    Book book2 = new Book("DAMN.", "Kendrick Lamar", "TEST4321");
    Book book3 = new Book("The Lion, The Witch and the Wardrobe", "CS Lewis", "TEST4567");
    Book book4 = new Book("Testing for dummies", "Kodi-Lee", "TEST3636");
    Book book5 = new Book("Malcolm X", "Alex Haley", "TESTX1");
    Book book6 = new Book("Tyson", "Mike Tyson", "TYSON5060");

    // Add books to the catalog
    catalog.add(book1);
    catalog.add(book2);
    catalog.add(book3);
    catalog.add(book4);
    catalog.add(book5);
    catalog.add(book6);

    // Users
    User user1 = new User("Kodi-Lee Johnson", "KLJ1237");
    User user2 = new User("Floyd Mayweather", "FJM4310");
    User user3 = new User("Miguel Cotto", "MAC1980");

    // Librarians
    Librarian librarian1 = new Librarian("Andre Ward", "ED209", "LIB1");
    Librarian librarian2 = new Librarian("Shakur Stevenson", "SS4789", "LIB2");

    // Borrow Books
    user1.borrowBook(book1);
    user2.borrowBook(book2);
    user3.borrowBook(book2);
    librarian1.borrowBook(book3);
    librarian1.borrowBook(book5);
    librarian2.borrowBook(book4);
    user3.borrowBook(book6);

    // Return books
    user1.returnBook(book1);
    user2.returnBook(book2);

    // Librarian adds and removes books from the catalog
    librarian1.addBook(new Book("GKMC", "Kendrick Lamar", "TEST0009"), catalog);
    librarian1.removeBook(book1, catalog);

    // Print status of books
    System.out.println("\nCatalog Status:");
    for (Book book : catalog) {
      book.printStatus();
    }

    // Print user details
    System.out.println("\nUser 1 Details:");
    displayUserDetails(user1);
    System.out.println("\nUser 2 Details");
    displayUserDetails(user2);
    System.out.println("\nUser 3 Details");
    displayUserDetails(user3);
    System.out.println("\nLibrarian 1 Details");
    displayUserDetails(librarian1);
    System.out.println("\nLibrarian 2 Details");
    displayUserDetails(librarian2);
  }

  // Method to display user details
  public static void displayUserDetails(User user) {
    System.out.println("Name: " + user.getName());
    System.out.println("Library ID: " + user.getLibraryId());

    if (user instanceof Librarian librarian) {
      System.out.println("Employee ID: " + librarian.getEmployeeId());
    }

    System.out.println("Books borrowed: " + user.getBooksBorrowed().size());
    for (Book book : user.getBooksBorrowed()) {
      System.out.println("Book title: " + book.getTitle() + " By: " + book.getAuthor());
    }

  }


}