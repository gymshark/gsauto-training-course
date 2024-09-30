package javaclassesandinterfacestask.Maria;

import java.util.ArrayList;

public class User implements ILibraryActions {

  ArrayList<Books> booksBorrowed = new ArrayList<>();
  private String name;
  private String libraryID;

  public User(String name, String libraryID) {
    this.name = name;
    this.libraryID = libraryID;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLibraryID() {
    return libraryID;
  }

  public void setLibraryID(String libraryID) {
    this.libraryID = libraryID;
  }

  public ArrayList<Books> getBooksBorrowed() {
    return booksBorrowed;
  }

  public void setBooksBorrowed(ArrayList<Books> booksBorrowed) {
    this.booksBorrowed = booksBorrowed;
  }


  @Override
  public void borrowBook(Books book) {
    if (book.isAvailable()) {
      booksBorrowed.add(book);
      System.out.println("Book has been borrowed by user- " + name + " with libID -" + libraryID + " and added to borrowed list");
    } else {
      System.out.println("Book  not available to borrow for user -" + name);
    }
  }

  @Override
  public void returnBook(Books book) {
    if (!book.isAvailable()) {
      booksBorrowed.remove(book);
      System.out.println("Book has been returned by user-" + name + " with libID -" + libraryID + " and removed from borrowed list");
    } else {
      System.out.println("Book is available to borrow now for user -" + name);
      book.setAvailable(true);
    }
  }
}

