package javaclassesandinterfacestask.akshathaLibrary;

import java.util.ArrayList;

public class User {

  //properties
  public String name;
  public String libraryId;
  public ArrayList<Book> booksBorrowed;

  //constructor
  public User(String name, String libraryId) {
    this.name = name;
    this.libraryId = libraryId;
    this.booksBorrowed = new ArrayList<>();
  }

  //Getters and Setters method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLibraryId() {
    return libraryId;
  }

  public void setLibraryId(String libraryId) {
    this.libraryId = libraryId;
  }

  public ArrayList<Book> getBooksBorrowed() {
    return booksBorrowed;
  }

  public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
    this.booksBorrowed = booksBorrowed;
  }

  //method to borrow book
  public void borrowBook(Book book) {
    if (book.isAvailable()) {
      booksBorrowed.add(book);
      book.borrowBook();
      System.out.println(name + " borrowed " + book.getTitle());
    } else {
      System.out.println(book.getTitle() + " is not available for borrowing.");
    }
  }

  //method to returns book
  public void returnBook(Book book) {
    if (booksBorrowed.contains(book)) {
      booksBorrowed.remove(book);
      book.returnBook();
      System.out.println(name + " returned " + book.getTitle());
    } else {
      System.out.println(book.getTitle() + " was not borrowed by " + name);
    }
  }
}
