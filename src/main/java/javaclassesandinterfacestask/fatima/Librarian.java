package javaclassesandinterfacestask.fatima;


public class Librarian extends User implements ILibraryActions {

    private String employeeID;

    public Librarian(String name, String libraryID) {
        super(name, libraryID);
        this.employeeID = employeeID;
    }


    @Override
    public void borrowBook() {
        System.out.println(super.getName() + " has borrowed the book");
    }

    @Override
    public void returnBook() {
        System.out.println(super.getName() + " has returned the book");
    }

    public void displayUserDetails() {
        System.out.println("Name: " + super.getName() + " Library ID: " + super.getLibraryID());
    }

}
