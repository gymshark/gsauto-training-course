package javaclassesandinterfacestask.Maria;

import java.awt.print.Book;
import java.util.ArrayList;

public class User implements  ILibraryActions {

    private String name;
    private String libraryID;
    ArrayList<Book> booksBorrowed = new ArrayList<>();

    public User(String name, String libraryID) {
        this.name = name;
        this.libraryID = libraryID;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public ArrayList<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }


    @Override
    public void borrowBook() {
        if

    }

    @Override
    public void returnBook() {

    }
}

/* 1.	Create a User class.
o	Properties:
	name: a String representing the user's name.
	libraryId: a String representing the ID of the library member.
	booksBorrowed: an ArrayList that stores the list of books borrowed by the user.
o	Methods:
	Constructor to initialise the User objects.
	Getters and setters for each property.
	A method borrowBook(Book book) that adds a book to the booksBorrowed list, if it's available.
	A method returnBook(Book book) that removes the book from booksBorrowed list and updates the book's availability.
*/