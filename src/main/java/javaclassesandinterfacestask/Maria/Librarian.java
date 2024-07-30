package javaclassesandinterfacestask.Maria;

import org.checkerframework.checker.units.qual.A;

import java.awt.print.Book;
import java.util.ArrayList;

public class Librarian extends User {


    private String employeeID;

    public Librarian(String name, String libraryID, String employeeID) {
        super(name, libraryID);
    }

    @Override
    public boolean borrowBook(Book book) {
        return super.borrowBook(book);
    }

    public void addBook(Books book) {
        getBooksBorrowed().add(book);
    }


    public void removeBook(Books book) {
        for (Books book : books) {
            if (Books.ISBN.equals(ISBN)) {
                book.remove(book);
                break;
            }
        }
    }
}
/* Part 3: Implement Inheritance
1.	Extend the User class with a Librarian class.
o	Additional Properties:
	employeeId: a String that represents the employee ID of the librarian.
o	Additional Methods:
	Methods to add or remove books from the library catalog.
	Override the borrowBook method to include restrictions or logging, if needed.
*/