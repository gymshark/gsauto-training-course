package javaclassesandinterfacestask.fatima;

import java.util.ArrayList;

public class User implements ILibraryActions {

    private String name;
    private String libraryID;
    private ArrayList<Book> booksBorrowed = new ArrayList<>();
    private boolean isAvailable;

    public User(String name, String libraryID, ArrayList<Book> booksBorrowed) {
        this.name = name;
        this.libraryID = libraryID;
        this.booksBorrowed = booksBorrowed;
    }

    public User(String name, String libraryID) {
        this.name = name;
        this.libraryID = libraryID;
    }

    public String getName() {
        return name;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            booksBorrowed.add(book);
            System.out.println("You have borrowed this book");
            isAvailable = false;
        } else System.out.println("You cannot borrow this book as it's not available");

    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            booksBorrowed.remove(book);
            System.out.println("Thank you for returning this book");
            isAvailable = true;
        } else System.out.println("You cannot return this book as it is not with you");
    }


    @Override
    public void borrowBook() {
        System.out.println(name + " has borrowed book");
    }

    @Override
    public void returnBook() {
        System.out.println(name + " has returned Book");
    }

    public void displayUserDetails() {
        System.out.println("Name: " + name + " Library ID: " + libraryID);
    }
}
