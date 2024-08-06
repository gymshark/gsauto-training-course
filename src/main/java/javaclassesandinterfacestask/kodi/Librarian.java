package javaclassesandinterfacestask.kodi;

import java.util.ArrayList;

public class Librarian extends User {

  private String employeeId;

  // Constructor
  public Librarian(String name, String libraryId, String employeeId) {
    super(name, libraryId);
    this.employeeId = employeeId;
  }

  // Getter and setter for employeeId
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  // Method to add a book to the library catalog
  public void addBook(Book book, ArrayList<Book> catalog) {
    catalog.add(book);
    System.out.println("Book added: "  + "Title: " +  book.getTitle() + " Author: " + book.getAuthor() + " ISBN: " + book.getIsbn());
  }

  // Method to remove a book from the library catalog
  public void removeBook(Book book, ArrayList<Book> catalog) {
    if (catalog.contains(book))
    {
      catalog.remove(book);
      System.out.println("Book removed: " + book.getTitle());
    } else {
      System.out.println("Book not available in catalog");
    }
  }

  // Override borrowBook method to log librarians borrowing books
  @Override
  public void borrowBook(Book book) {
    super.borrowBook(book);
    System.out.println("Librarian: " + getName() + " borrowed: " + book.getTitle() + ": Librarians have a shorter return period ");
  }
}

