package OOPs;

class Shape {
    public void area() {
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
    public void area(int length, int height) {
        System.out.println(0.5 * length * height);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*(r*r));
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();

        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(10, 5);

        Circle circle = new Circle();
        circle.area();
        circle.area(5);
    }
}
