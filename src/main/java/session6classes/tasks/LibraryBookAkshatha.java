package session6classes.tasks;

public class LibraryBookAkshatha {

  public String author;
  public String title;
  private int year;

  public LibraryBookAkshatha(String author, String title, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void bookDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Year: " + year);
  }

  public static void main(String[] args) {
    LibraryBookAkshatha book = new LibraryBookAkshatha("Akshatha", "My book", 1111);
    book.setYear(2024);
    book.bookDetails();
  }
}
