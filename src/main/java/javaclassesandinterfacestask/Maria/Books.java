package javaclassesandinterfacestask.Maria;

public class Books {
    private String title;
    private String author;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private String ISBN;

    private boolean isAvailable;

    public Books(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

 public boolean borrowBook(Books book ){
        if(book.isAvailable){
        isAvailable = true;

        }

     return false;
 }

 public boolean returnBook(Books book){
     isAvailable = true;
     return true;
 }




}
/* 1.	Create a Book class.
o	Properties:
	title: a String representing the title of the book.
	author: a String representing the author of the book.
	isbn: a String representing the ISBN number of the book.
	isAvailable: a boolean that indicates whether the book is available for checkout.
o	Methods:
	Constructor to initialise the Book objects.
	Getters and setters for each property.
	A method borrowBook() that changes the isAvailable status to false.
	A method returnBook() that sets isAvailable back to true.
 */