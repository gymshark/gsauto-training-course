package session7fieldsconstructors.tasks;

public class RectangleFatima {

    private double length;
    private double width;

    public RectangleFatima() {
        length = 1;
        width = 1;
    }

    public RectangleFatima(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (2 * (length + width));
    }

    public String printRectangleDetails() {
        return ("Length: " + length + " Width: " + width + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        RectangleFatima rectangle1 = new RectangleFatima(10, 4);
        RectangleFatima rectangle2 = new RectangleFatima();

        System.out.println(rectangle1.printRectangleDetails());
        System.out.println(rectangle2.printRectangleDetails());
    }
}
