package javaclassesandinterfacestask.akshathaLibrary;

public class Book {

  //properties
  public String title;
  public String author;
  public String isbn;
  public boolean isAvailable;

  //constructor
  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = true;
  }

  //Getters and Setters for each property
  public String getTitle() {
    return title;
  }

  public String setTitle(String title) {
    this.title = title;
    return title;
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

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  //borrow book method
  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
      System.out.println("Book has been borrowed");
    } else {
      System.out.println("Book is not available");
    }
  }

  //return book method
  public void returnBook() {
    if (isAvailable) {
      System.out.println("Book has been returned");
    } else {
      System.out.println("Book is available");
    }
  }
}
