package session6classes;

public class BookFatima {
    private String bookTitle;
    private String author;
    private int yearOfPublication = 2030;


    public BookFatima(String bookTitle, String author, int yearOfPublication) {
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
}
