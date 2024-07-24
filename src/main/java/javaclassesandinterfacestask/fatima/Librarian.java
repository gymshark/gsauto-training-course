package javaclassesandinterfacestask.fatima;

import java.util.List;

public class Librarian extends User {

    public Librarian(String title, String author, String isbn, boolean isAvailable) {
        super(title, author, isbn, isAvailable);
    }

    String employeeID;

    public List<Book> libraryCatalogue;
    Book book;


    public void addBooks() {
        libraryCatalogue.add(book);
        System.out.println("Book has been added: " + book);

    }

    public void removeBooks() {
        libraryCatalogue.remove(book);
        System.out.println("Book has been removed: " + book);
    }
}
