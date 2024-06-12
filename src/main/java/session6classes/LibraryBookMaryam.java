package session6classes;

public class LibraryBookMaryam {

    // creating fields and their access modifiers

    public String BookTitle;
    public String Author;
    private int yearOfPublication;

    // contructor to initilize the fields above
    public LibraryBookMaryam (String BookTitle , String Author , int yearOfPublication)
        {
        this.BookTitle = BookTitle;
        this.Author = Author;
        this.yearOfPublication = yearOfPublication;
         }
    // Get year of publication since its private

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    // set year of publication
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void BookDetails(){
        System.out.println("Book Title:" + BookTitle);
        System.out.println("Author:" + Author);
        System.out.println("Year of publication:" + yearOfPublication);

    }

    public static void main(String[] args) {
        // create instance of class LibrarybookMaryam and assign values
        LibraryBookMaryam bookMaryam = new LibraryBookMaryam ("Java book class" , "Maryam" , 1980);
        LibraryBookMaryam bookMaryam1 = new LibraryBookMaryam("test" , "maryam", 2002);
        //Set another value to the year of publication using SET method
        bookMaryam.setYearOfPublication(2002);
        bookMaryam1.setYearOfPublication(2024);

        bookMaryam.BookDetails();
        bookMaryam1.BookDetails();

    }
}