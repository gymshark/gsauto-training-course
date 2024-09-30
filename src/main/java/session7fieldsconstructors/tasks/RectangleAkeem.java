package session7fieldsconstructors.tasks;

public class RectangleAkeem {

    private final double length;
    private final double width;

    public RectangleAkeem() {
        length = 1.0;
        width = 1.0;
    }

    private RectangleAkeem(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double getLength() {
        return length;
    }

    private double getWidth() {
        return width;
    }

    private double calculateArea() {
        return length * width;
    }

    private double calculatePerimeter() {
        return 2 * (length * width);
    }

    public String getRectangleDetails() {
        return "L: " + getLength() + "\n" + "W: " + getWidth() + "\n" + "Area: " + calculateArea() + "\n"
                +  "Perimeter: " + calculatePerimeter();
    }

    public static void main(String[] args) {
        RectangleAkeem rectangleAkeem = new RectangleAkeem();
        RectangleAkeem rectangleAkeem2 = new RectangleAkeem(2.5, 6.5);

        System.out.println("Rectangle 1 \n" + rectangleAkeem.getRectangleDetails());
        System.out.println("Rectangle 2 \n" + rectangleAkeem2.getRectangleDetails());
    }
}
