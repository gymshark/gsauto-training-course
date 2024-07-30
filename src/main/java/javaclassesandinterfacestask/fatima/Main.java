package javaclassesandinterfacestask.fatima;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("Fatima", "LibraryID1");
        User user2 = new User("Faisa", "LibraryID2");
        User user3 = new User("Zahra", "LibraryID3");
        User user4 = new User("Muna", "LibraryID4");

        Librarian librarian1 = new Librarian("Amina", "LibraryID00", "122345");

        Book book1 = new Book("Never let me go", "Kazuo Ishiguro", 1234, false);
        Book book2 = new Book("Test book", "QA", 666, true);
        Book book3 = new Book("Harry potter", "JK Rowling", 6789, true);

        user2.displayUserDetails();
        user3.displayUserDetails();
        user4.displayUserDetails();
        librarian1.displayUserDetails();


        librarian1.returnBook(book1);

        user1.borrowBook(book3);
        user1.returnBook(book3);

        user1.borrowBook(book1);

        user4.borrowBook(book2);

        librarian1.borrowBook();
        user1.returnBook();
        librarian1.returnBook();
        user1.borrowBook();

        System.out.println(book1.isAvailable);
        System.out.println(book2.isAvailable);
        System.out.println(book3.isAvailable);



    }
}
