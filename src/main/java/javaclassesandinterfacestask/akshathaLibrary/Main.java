package javaclassesandinterfacestask.akshathaLibrary;

public class Main {

  //method to display user details
  public static void displayUserDetails(User user) {
    System.out.println("Books borrowed: ");
    for (Book book : user.getBooksBorrowed()) {
      System.out.println("user details " + book.getTitle());
    }
  }

  public static void main(String[] args) {
    //create books
    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
    Book book2 = new Book("1984", "George Orwell", "987654321");
    Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1112131415");

    //create users
    User user1 = new User("Alice", "U001");
    User user2 = new User("Bob", "U002");

    //create librarian
    Librarian librarian = new Librarian("E123", "Charlie", "L001");

    // Borrow and return books
    user1.borrowBook(book1);
    user2.borrowBook(book2);
    user1.returnBook(book1);
    librarian.borrowBook(book3);

    // Display user details
    displayUserDetails(user1);
    displayUserDetails(user2);
    displayUserDetails(librarian);
  }

}
