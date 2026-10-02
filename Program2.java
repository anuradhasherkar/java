abstract class Shape {
    abstract double area();
}

abstract class Shape2D extends Shape {
}

abstract class Shape3D extends Shape {
    abstract double volume();
}

class Circle extends Shape2D {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape2D {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Sphere extends Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double area() {
        return 4 * Math.PI * radius * radius;
    }

    double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double area() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Sphere s = new Sphere(5);
        Cube cube = new Cube(4);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
        System.out.println("Sphere Area = " + s.area());
        System.out.println("Sphere Volume = " + s.volume());
        System.out.println("Cube Area = " + cube.area());
        System.out.println("Cube Volume = " + cube.volume());
    }
}
