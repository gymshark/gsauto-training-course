package session6classes;

public class LibraryBookFatima {

    public static void main(String[] args) {
        BookFatima book1 = new BookFatima("Diaspora Diaries", " Fatima", 2002);
        BookFatima book2 = new BookFatima("The Cat Sat On The Mat", "Unknown", 2020);

        book1.setYearOfPublication(2030);
        book2.setYearOfPublication(1993);

        book1.bookDetails();
        book2.bookDetails();
    }
}
