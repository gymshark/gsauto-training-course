package javaclassesandinterfacestask.fatima;

import java.util.ArrayList;

public class Book {

    String name;
    String libraryID;
    ArrayList<String> booksBorrowed;
    boolean isAvailable;

    public Book(String name, String libraryID) {
        this.name = name;
        this.libraryID = libraryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<String> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }


    public void borrowBook(Book book) {
            if (!booksBorrowed.contains(book)) {
            booksBorrowed.add(String.valueOf(book));
                System.out.println("You can borrow this book as it is available");
                isAvailable = true;
        }

    }
    public void returnBook(Book book) {
        if (booksBorrowed.contains(book)) {
            booksBorrowed.remove(book);
            System.out.println("Thank you for returning this book");
            isAvailable = false;
        }
    }


}
