// Superclass
class Shape {
    double dim1, dim2;

    // Constructor
    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Method to be overridden
    double area() {
        System.out.println("Area method in Shape class.");
        return 0;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {

    Rectangle(double length, double breadth) {
        super(length, breadth); // Pass dimensions to Shape
    }

    @Override
    double area() {
        return dim1 * dim2; // Area of rectangle = length * breadth
    }
}

// Subclass: Triangle
class Triangle extends Shape {

    Triangle(double base, double height) {
        super(base, height); // Pass dimensions to Shape
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2; // Area of triangle = 0.5 * base * height
    }
}

// Main class
public class ShapeArea {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}
