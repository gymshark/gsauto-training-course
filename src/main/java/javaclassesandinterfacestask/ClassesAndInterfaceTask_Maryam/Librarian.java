package javaclassesandinterfacestask.ClassesAndInterfaceTask_Maryam;

import java.util.ArrayList;

public class Librarian extends User {

  private String employeeId;

  public Librarian(String name, String libraryId, String employeeId) {
    super(name, libraryId);
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public void addBook(ArrayList<Book> catalog, Book book) {
    catalog.add(book);
  }

  public void removeBook(ArrayList<Book> catalog, Book book) {
    if (catalog.contains(book)) {
      catalog.remove(book);
    } else {
      System.out.println("The book is not in catalog");
    }
  }

  @Override
  public void borrowBook(Book book) {
    System.out.println("Librarian borrowing book is restricted");
  }
}
