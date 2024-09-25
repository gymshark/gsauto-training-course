package javaclassesandinterfacestask.Maria;

import java.util.ArrayList;

public class Librarian extends User {


  ArrayList<Books> bookCatalog = new ArrayList<>();
  private String employeeID;


  public Librarian(String name, String libraryID, String employeeID) {
    super(name, libraryID);
    this.employeeID = employeeID;
  }


  public void addBook(Books book) {
    if (!bookCatalog.contains(book)) {
      bookCatalog.add(book);
      book.setAvailable(true);
      System.out.println("Book Added to catalog");
      System.out.println(book.isAvailable());
    }
  }

  public void removeBook(Books book) {
    if (bookCatalog.contains(book)) {
      bookCatalog.remove(book);
      book.setAvailable(false);
      System.out.println("Book  removed from Catalog");
      System.out.println(book.isAvailable());

    }
  }

  @Override
  public void borrowBook(Books book) {
    if (booksBorrowed.contains(book)) {
      System.out.println("User -" + getName() + " cannot borrow the book as not available");
    } else {
      System.out.println("Wait a min, let me fetch the book for user -" + getName() + " to borrow");
    }

  }
}
