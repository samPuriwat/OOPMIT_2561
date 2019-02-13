package lab8;

public class Circle extends GraphicObject{
    private double radius;
    final double PI = 3.14;

    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    void findArea() {
        System.out.println("The area is: "+(PI*(radius*radius)));
    }
    // area of circle = PI*(r*r)


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                "} " + super.toString();
    }
}
