package javaclassesandinterfacestask.Maria;

import java.awt.print.Book;
import java.util.ArrayList;

public class User implements  ILibraryActions {

    private String name;
    private String libraryID;
    ArrayList<Books> booksBorrowed = new ArrayList<>();

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

    public ArrayList<Books> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<Books> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }




   @Override
    public void borrowBook(Books book){
        if(book.isAvailable()){
            booksBorrowed.add(book);
            System.out.println("Book has been borrowed and added to borrowed list");
        }else{
            System.out.println("Book  not available to borrow");
        }
    }
@Override
    public void returnBook(Books book){
        if(!book.isAvailable()){
            booksBorrowed.remove(book);
            System.out.println("Book has been returned and removed from borrowed list");
        }else{
            System.out.println("Book is available to borrow now");
            book.setAvailable(true);
        }
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