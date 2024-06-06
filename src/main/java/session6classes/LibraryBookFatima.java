package session6classes;

public class LibraryBookFatima {

    public static class Book {
        private String bookTitle;
        private String author;
        private int yearOfPublication;


        public Book(String bookTitle, String author, int yearOfPublication) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
        }
        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        public void bookDetails() {
            System.out.println("Book title:" + bookTitle + " Author:" + author + " Year: " + getYearOfPublication());
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Diaspora Diaries", " Fatima", 2002);
        Book book2 = new Book("The Cat Sat On The Mat", "Unknown", 2020);

        book1.setYearOfPublication(20300);
        book2.setYearOfPublication(1993);

        book1.bookDetails();
        book2.bookDetails();
    }
}
