// Shape is the Parent Class.
// The Sub-classes will inherit it's properties.
class Shape {
    public void draw() {
        System.out.println("Drawing a Shape...");
    }
}

// Circle is the Sub-Class.
// It inherits the properties of Shape - Parent Class.
class Circle extends Shape {

    // Replacing the initial method from Shape which it inherits.
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

// Rectangle is the Sub-Class.
// It inherits the properties of Shape - Parent Class.
class Rectangle extends Shape {

    // Replacing the initial method from Shape which it inherits.
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

// Triangle is the Sub-Class.
// It inherits the properties of Shape - Parent Class.
class Triangle extends Shape {

    // Replacing the initial method from Shape which it inherits.
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

public class Activity12_Matiga {
    public static void main(String[] args) {

        // Polymorphism: Shape array holds different subclass objects
        Shape[] shapes = new Shape[3];

        // Parent reference (Shape) holding child objects (Circle, Rectangle, Triangle)
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        // Dynamic method dispatch: Java decides at runtime which draw() to call
        // based on the ACTUAL object, not the reference type
        for (int i = 0; i < shapes.length; i++) {

            // Same call, different behavior = polymorphism
            shapes[i].draw();
        }
    }
}