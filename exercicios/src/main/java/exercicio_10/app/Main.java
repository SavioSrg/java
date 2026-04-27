package exercicio_10.app;

import exercicio_10.model.Circle;
import exercicio_10.model.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circulo = new Circle(5);

        Cylinder cilindro = new Cylinder(6, 8);

        circulo.draw();
        System.out.println("Área do círculo: " + circulo.calculateArea());

        System.out.println("-".repeat(35));

        cilindro.draw();
        System.out.println("Área do cilindro: " + cilindro.calculateArea());
    }
}
