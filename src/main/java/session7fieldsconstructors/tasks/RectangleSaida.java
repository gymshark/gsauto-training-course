package session7fieldsconstructors.tasks;

public class RectangleSaida {

    private final double length;
    private final double width;

    //default constructor
    public  RectangleSaida (){
        this.length = 1.0;
        this.width =1.0;
    }

    //parameterized constructor
    public RectangleSaida(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea (){
        return length * width;
    }

    public double calculatePerimeter (){
        return (2 * (length + width));
    }
    public static void main(String[] args) {
        RectangleSaida defaultConstructor = new RectangleSaida();
        System.out.println("The area of the rectangle using Default Constructor is " + defaultConstructor.calculateArea());
        System.out.println("The perimeter of the rectangle using Default Constructor is " + defaultConstructor.calculatePerimeter());

        RectangleSaida parameterizedConstructor = new RectangleSaida(10, 20);
        System.out.println("The area of the rectangle using Parameterized Constructor is " + parameterizedConstructor.calculateArea());
        System.out.println("The perimeter of the rectangle using Parameterized Constructor is " + parameterizedConstructor.calculatePerimeter());
    }
}
