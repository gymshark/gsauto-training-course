package javaclassesandinterfacestask.Maria;

public class Main {

  public static void main(String[] args) {

    Books book1 = new Books("Harry Potter1", "JK ROWLING", "HP10", true);

    Books book2 = new Books("Twilight Saga", "JK ROWLING", "HP11", false);

    Books book3 = new Books("Scorpio ", "Robert Ludlum", "HP12", true);
    Books book4 = new Books("Famous 5", "End Blyton", "HP13", true);

    Books book5 = new Books("Wings of Fire", "Abdul Kalaam", "HP14", false);


    User user1 = new User("Ron", "TF01");
    User user2 = new User("Brad", "TF02");
    User user3 = new User("Leslie", "TF03");
    User user4 = new User("Jonny", "TF04");


    Librarian lib1 = new Librarian("Kelly", "67", "E01");
    Librarian lib2 = new Librarian("Shelly", "68", "E02");

// Borrow and return books methods
    user1.borrowBook(book2);
    user4.borrowBook(book2);
    lib1.removeBook(book1);
    lib2.addBook(book3);
    lib2.borrowBook(book1);
    book3.borrowBook(book3);
    book3.returnBook(book2);
    lib2.removeBook(book4);
    user2.borrowBook(book5);
    user2.borrowBook(book4);
    user2.borrowBook(book3);
    user2.borrowBook(book2);

    user3.returnBook(book2);
    book2.printStatus();
// Librarian adds books to Catalog
    lib1.bookCatalog.add(book1);
    lib1.bookCatalog.add(book2);
    lib1.bookCatalog.add(book3);

//Printing status of books
    System.out.println("List of books in the Catalog(librarian 1)");
    for (Books book : lib1.bookCatalog) {
      book.printStatus();
    }

    lib2.booksBorrowed.add(book1);
    lib2.booksBorrowed.add(book2);
    lib2.booksBorrowed.add(book3);
    lib2.booksBorrowed.add(book4);
    lib2.booksBorrowed.add(book5);

//Printing list of books borrowed (librarian 2)
    System.out.println("List of Books Borrowed by user 1 ");
    for (Books book : user2.getBooksBorrowed()) {
      book.printStatus();
    }
  }
}
