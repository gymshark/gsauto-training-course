package session7fieldsconstructors;

public class Rectangle_Maryam {
    //Fields
    private double length;
    private double width;

    // DefaultConstructors
    public Rectangle_Maryam()
    {
        this.width = 1.0;
        this.length = 1.0;
    }
    // parameterized Constructors
    public Rectangle_Maryam (double width, double length)
    {
        this.width = width;
        this.length = length;
      }
        // method to calculate the area
        public double CalculateArea () {

        return this.width * this.length;
        }
        // calculate perimeter

        public  double CalculatePerimeter(){
        return 2*(this.length + this.width);
        }

    // method to print the details of rectangle

    public void DisplayDetails () {
        System.out.println("Rectangle Details");
        System.out.println("Length of Rectangle:" + this.length);
        System.out.println("Width of Rectangle:" + this.width);
        System.out.println("Area of Rectangle" + CalculateArea());
        System.out.println("Perimeter of Rectangle:" + CalculatePerimeter());
        }

    public static void main(String[] args) {
        // create rectangle using default constructor
        Rectangle_Maryam defaultRectangle = new Rectangle_Maryam();
        System.out.println("Default Rectangle:");
        defaultRectangle.DisplayDetails();
        System.out.println();

        // Create a rectangle using the parameterized constructor
        Rectangle_Maryam customRectangle = new Rectangle_Maryam(8.0, 3.0);
        System.out.println("Custom Rectangle:");
        customRectangle.DisplayDetails();


    }

}
