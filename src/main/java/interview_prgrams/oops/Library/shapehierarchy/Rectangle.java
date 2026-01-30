package interview_prgrams.oops.Library.shapehierarchy;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public void display() {
        System.out.println("Rectangle with width " + width + " and height " + height + ", Area: " + area());
    }
}
