package exercicio_10.model;

public class Circle extends Shape{
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Desenho circular com base no raio");
    }

    @Override
    public double calculateArea() {
        double area = pi * Math.pow(getRadius(), 2);
        return area;
    }
}
