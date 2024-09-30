package session6classes.tasks;

public class LibraryBookFatima {

  private final String bookTitle;
  private final String author;
  private int yearOfPublication;

  public LibraryBookFatima(String bookTitle, String author, int yearOfPublication) {
    this.bookTitle = bookTitle;
    this.author = author;
    this.yearOfPublication = yearOfPublication;
  }

  public int getYearOfPublication() {
    return yearOfPublication;
  }

  public void setYearOfPublication(int yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  public void bookDetails() {
    System.out.println("Book title:" + bookTitle + " Author:" + author + " Year: " + getYearOfPublication());
  }

  public static void main(String[] args) {
    LibraryBookFatima book1 = new LibraryBookFatima("Diaspora Diaries", " Fatima", 2002);
    LibraryBookFatima book2 = new LibraryBookFatima("The Cat Sat On The Mat", "Unknown", 2020);

    book1.setYearOfPublication(20300);
    book2.setYearOfPublication(1993);

    book1.bookDetails();
    book2.bookDetails();
  }

}
