package session6classes.tasks;

public class LibraryBookMaria {

  //Creating fields and their access modifiers.
  public String bookTitle;
  public String author;
  private String yearOfPublication; //private field

  //Constructor initialising all  fields
  public LibraryBookMaria(String bookTitle, String author, String yearOfPublication) {
    this.bookTitle = bookTitle;
    this.author = author;
    this.yearOfPublication = yearOfPublication;
  }

  //Getters and Setters
  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getYearOfPublication() {
    return yearOfPublication;
  }

  public void setYearOfPublication(String yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  //Method displaying Book details
  public void displayBookDetails() {
    System.out.println("*** Book Details ***");
    System.out.println("Title of the book  -" + getBookTitle());
    System.out.println("Book Author -  " + getAuthor());
    System.out.println("Year of Publication - " + getYearOfPublication());
  }

  //Main Method
  public static void main(String[] args) {
    LibraryBookMaria book1 = new LibraryBookMaria("Jungle book", "Henry Evans", "1898");
    book1.setYearOfPublication("1998"); //Update year of publication
    book1.displayBookDetails(); // Print Book details
  }
}
