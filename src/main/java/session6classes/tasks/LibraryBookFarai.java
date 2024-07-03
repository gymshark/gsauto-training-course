package session6classes.tasks;

public class LibraryBookFarai {

  public String title;
  public String author;
  private int publicationYear;

  public LibraryBookFarai(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Year of Publication: " + publicationYear);
  }

  public static void main(String[] args) {

    LibraryBookFarai bookCopy = new LibraryBookFarai("The Subtle Art of Not Giving a F*ck", "Mark Manson", 2016);

    bookCopy.displayDetails();

    bookCopy.setPublicationYear(2017);

    System.out.println("\nAmmended book details: \n");
    bookCopy.displayDetails();
  }
}
