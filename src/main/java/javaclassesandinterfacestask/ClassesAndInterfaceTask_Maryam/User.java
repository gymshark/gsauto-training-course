package javaclassesandinterfacestask.ClassesAndInterfaceTask_Maryam;

import java.util.ArrayList;

public class User {

  private String name;
  private String libraryId;
  private ArrayList<Book> booksBorrowed;

  // constructors
  public User(String name, String libraryId) {
    this.name = name;
    this.libraryId = libraryId;
    this.booksBorrowed = new ArrayList<>();
  }

  //Getters and setters

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

// methods

  public void borrowBook(Book book) {
    if (book.isAvailable()) {
      booksBorrowed.add(book);
      book.borrowBook();
    } else {
      System.out.println("this book is not available");
    }
  }

  public void returnBook(Book book) {
    if (booksBorrowed.contains(book)) {
      booksBorrowed.remove(book);
      book.returnBook();
    } else {
      System.out.println("This book is not borrowed by user");
    }
  }
}
