package javaclassesandinterfacestask.Maria;

public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("Harry Potter1","JK ROWLING","HP10",true);

        Books book2 = new Books("Harry Potter2","JK ROWLING","11",false);

        Books book3 = new Books("Harry Potter","JK ROWLING","HP12",true);
        Books book4 = new Books("Harry Potter","JK ROWLING","HP13",true);

        Books book5 = new Books("Harry Potter","JK ROWLING","HP14",false);




        User user1 = new User("Ron","TF01");
        User user2 = new User("Brad","TF02");
        User user3 = new User("Leslie","TF03");
        User user4 = new User("Jonny","TF04");


        Librarian lib1 = new Librarian("Kelly","67");
        Librarian lib2 = new Librarian("Shelly","68");


    }
}
/* Part 4: Demonstrate Polymorphism
1.	Create a method in your main program to display user details.
o	The method should be able to accept objects of both User and Librarian classes, demonstrating polymorphism. Use method overriding if necessary.


Tasks:
•	Implement all the above classes and methods.
•	In your main method, create several Book and User objects, and at least one Librarian.
•	Simulate borrowing and returning books.
•	Print the status of books and list of books borrowed by users.

*/