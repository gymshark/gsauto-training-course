package javaclassesandinterfacestask.fatima;


public class Librarian extends User implements ILibraryActions {

    String employeeID;

    public Librarian(String name, String libraryID, String employeeID) {
        super(name, libraryID);
        this.employeeID = employeeID;
    }

    @Override
    public void borrowBook() {
        System.out.println(name + " has borrowed the book");
    }

    @Override
    public void returnBook() {
        System.out.println(name + " has returned the book");
    }

    public void displayUserDetails() {
        System.out.println("Name: " + name + " Library ID: " + libraryID);
    }

}
