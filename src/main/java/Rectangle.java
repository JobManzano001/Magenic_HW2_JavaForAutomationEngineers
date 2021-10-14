import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [X] Update both the set method for rectangle like you did for square
 *      [X] Write the setters for the Rectangle Class
 *      [X] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    // TODO FOR HOMEWORK: Write the setLength method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero
    public void setLength(double length) {
        if(length>0)
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    // TODO FOR HOMEWORK: Write the setWidth method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero
    public void setWidth(double width) {
        if(width>0)
            this.width = width;
    }

    // TODO FOR HOMEWORK: Write the method for area
    public double area(){
        return length * width;
    }

    // TODO FOR HOMEWORK: Write the method for perimeter
    public double perimeter(){
        return 2*(length + width);
    }
    // TODO FOR HOMEWORK: Write a main method

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        //declare scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle");
        rec.setLength(scanner.nextDouble());

        System.out.println("Enter width of rectangle");
        rec.setWidth(scanner.nextDouble());

        double area = rec.area();
        double perimeter = rec.perimeter();

        System.out.println("A rectangle with  length of " + rec.getLength() + " has an area of: " + area);
        System.out.println("A rectangle with  length of " + rec.getLength() + " has a perimeter of: " + perimeter);
    }
}