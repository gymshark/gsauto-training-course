package javaclassesandinterfacestask.ClassesAndInterfaceTask_Maryam;

public class Book {

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

  // getters and setters

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

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
    } else {
      System.out.println("Book is already borrowed");

    }
  }

  public void returnBook() {
    isAvailable = true;
  }

  @Override
  public String toString() {
    return title + " by " + author + " (ISBN: " + isbn + ")";
  }
}
