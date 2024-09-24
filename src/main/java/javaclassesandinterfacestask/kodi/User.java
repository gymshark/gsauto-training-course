package javaclassesandinterfacestask.kodi;

import java.util.ArrayList;

public class User implements ILibraryActions {

  // Fields
  private String name;
  private String libraryId;
  private ArrayList<Book> booksBorrowed;

  // Constructor
  public User(String name, String libraryId) {
    this.name = name;
    this.libraryId = libraryId;
    this.booksBorrowed = new ArrayList<>();
  }

  // Getters and setters
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

  // Method to borrow a book
  public void borrowBook(Book book) {
    if (book.isAvailable()) {
      book.borrowBook();
      booksBorrowed.add(book);
      System.out.println(name + " borrowed: " + book.getTitle());
    } else {
      System.out.println(book.getTitle() + " is not available for: " + getName());
    }
  }

  // Method to return a book
  public void returnBook(Book book) {
    if (booksBorrowed.contains(book)) {
      book.returnBook();
      booksBorrowed.remove(book);
      System.out.println(name + " returned: " + book.getTitle());
    } else {
      System.out.println("This book was not borrowed by " + name);
    }
  }

}
