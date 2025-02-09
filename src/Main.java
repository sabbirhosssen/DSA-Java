abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle calculate :"+circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0,5.0);
        System.out.println("Rectangle calculate:"+rectangle.calculateArea());
    }
}
