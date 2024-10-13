package session6classes.tasks;

public class LibraryBookSaida {
    public String title;
    public String author;
    private int publicationYear;

    public LibraryBookSaida(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void updatePublicationYear(int newPublicationYear) {
        this.publicationYear = newPublicationYear;
    }

    public void bookInfo() {
        System.out.println("The title is " + title);
        System.out.println("The author is " + author);
        System.out.println("The publication year is " + publicationYear);
    }

    public static void main(String[] args) {
        LibraryBookSaida libraryBookSaida = new LibraryBookSaida("Pride and Prejudice", "Jane Austen",1813);
        libraryBookSaida.bookInfo();
        libraryBookSaida.updatePublicationYear(2024);
        System.out.println("The updated publication year is " + libraryBookSaida.getPublicationYear());
    }
}




