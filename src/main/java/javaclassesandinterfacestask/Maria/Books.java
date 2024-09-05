package javaclassesandinterfacestask.Maria;

public class Books {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Books(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public void borrowBook(Books book) {
        if (book.isAvailable) {
            book.setAvailable(false);
            System.out.println("Book -" + title + " by author- " + author + " with ISBN -" + ISBN + " was borrowed successfully");
        } else
            System.out.println("Book -" + title + " by author- " + author + " with ISBN -" + ISBN + " not available to borrow");

    }

    public void returnBook(Books book) {
        book.setAvailable(true);
        System.out.println("Book - " + title + " by author- " + author + " with ISBN -" + ISBN + " was returned and is now available");
    }

    public void printStatus() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}
