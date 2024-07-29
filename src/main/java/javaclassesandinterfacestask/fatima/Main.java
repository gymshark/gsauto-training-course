package javaclassesandinterfacestask.fatima;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Harry Potter", "JK Rowling", 2345, false);
        User user2 = new User("Tis a book", "Me", 2343, true);
        User user3 = new User("Another book", "You", 666, false);

        Librarian librarian1 = new Librarian("Never let me go", "Kazuo Ishiguro", 5674, true);

        Book book1 = new Book("Book", "ID");
        Book book2 = new Book("Second book", "id2");
        Book book3 = new Book("Another book", "third id");


        user1.returnBook();
        System.out.println(user1.isAvailable);

        user2.borrowBook();
        System.out.println(user2.isAvailable);

        book1.booksBorrowed.add("Book1");
        book1.booksBorrowed.add("Book2");
        book1.booksBorrowed.add("Book3");
        book1.booksBorrowed.add("Book4");

        System.out.println(book1.getBooksBorrowed());

        librarian1.libraryCatalogue.add(book1);
        librarian1.libraryCatalogue.add(book2);
        librarian1.libraryCatalogue.add(book3);


        //•	Implement all the above classes and methods.
        //•	Simulate borrowing and returning books.
        //•	Print the status of books and list of books borrowed by users.

//        public void displayUserDetails() {
//
//        }





    }
}
