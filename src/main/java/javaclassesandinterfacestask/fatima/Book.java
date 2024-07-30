package javaclassesandinterfacestask.fatima;

public class Book {

    String title;
    String author;
    int isbn;
    boolean isAvailable;

    public Book(String title, String author, int isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }


}
