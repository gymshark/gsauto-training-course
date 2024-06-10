package session6classes;

public class LibraryBookKodi {

  private final String bookTitle;
  private final String author;
  private int year;

  public LibraryBookKodi(String bookTitle, String author, int year) {
    this.bookTitle = bookTitle;
    this.author = author;
    this.year = year;
  }


  public void setYear(int year) {
    this.year = year;
  }

  // Method to display all details of the book
  public void displayBookDetails() {
    System.out.println("Title: " + bookTitle);
    System.out.println("Author: " + author);
    System.out.println("Published: " + year);
  }

  public static void main(String[] args) {
    LibraryBookKodi book = new LibraryBookKodi("The Bomber", "Tony Bellew", 2020);

    // Initial book details
    System.out.println("Incorrect book details:");
    book.displayBookDetails();

    // Modify book year
    book.setYear(2023);
    //System.out.println("\nSet correct year: " + book.setYear(2023));

    //display book with correct year
    System.out.println("\nUpdated Book Details:");
    book.displayBookDetails();
  }
}