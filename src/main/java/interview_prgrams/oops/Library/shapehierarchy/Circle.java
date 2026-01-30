package interview_prgrams.oops.Library.shapehierarchy;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius " + radius + ", Area: " + area());
    }
}
