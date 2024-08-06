package javaclassesandinterfacestask.kodi;

public class Book {

  // Fields
  private String title;
  private String author;
  private String isbn;
  private boolean isAvailable;

  // Constructor
  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = true;
  }

  // Getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  // Method to borrow the book
  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
    } else {
      System.out.println("Book is not available");
    }
  }

  // Method to return the book
  public void returnBook() {
    isAvailable = true;
  }

  // Method to print book status
  public void printStatus() {
    System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
  }
}
