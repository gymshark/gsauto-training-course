package javaclassesandinterfacestask.akshathaLibrary;

import java.util.ArrayList;

public class Librarian extends User {

  //properties
  public String employeeId;

  //Constructor
  public Librarian(String employeeId, String name, String libraryId) {
    super(name, libraryId);
    this.employeeId = employeeId;
  }

  //getter and setter methods
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  //method to add or remove books from the catalog
  public void addBookToCatalog(ArrayList<Book> catalog, Book book) {
    catalog.add(book);
    System.out.println(book.getTitle() + " has been added to the catalog by " + getName());
  }

  public void removeBookFromCatalog(ArrayList<Book> catalog, Book book) {
    if (catalog.contains(book)) {
      catalog.remove(book);
      System.out.println(book.getTitle() + " has been removed from the catalog by " + getName());
    } else {
      System.out.println(book.getTitle() + " is not in the catalog.");
    }
  }

  //Override the borrowbook method to include restrictions or logging
  @Override
  public void borrowBook(Book book) {
    System.out.println("Librarian " + getName() + " is borrowing the book: " + book.getTitle());
    super.borrowBook(book);
  }
}
