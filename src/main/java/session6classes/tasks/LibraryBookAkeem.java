package session6classes.tasks;

public class LibraryBookAkeem {
    public String title;
    public String author;
    private int yearOfPublication;

    public static void main(String[] args) {
        LibraryBookAkeem book1 = new LibraryBookAkeem("Learning Java", "Niemeyer & Leuck", 2012);
        book1.setYearOfPublication(2013);
        System.out.println(book1.getBookDetails());
    }

    public LibraryBookAkeem(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getBookDetails() {
    return getTitle() + "\n" + getAuthor() + "\n" + getYearOfPublication();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
