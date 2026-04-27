package exercicio_10.model;

public class Cylinder extends Shape {
    private double radius;
    private double height;
    private double pi = Math.PI;

    public Cylinder(double radius, double height) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Desenho de um cilindro");
    }

    @Override
    public double calculateArea() {
        double area = (2 * pi * getRadius()) * (getRadius() + getHeight());
        return area;
    }
}
