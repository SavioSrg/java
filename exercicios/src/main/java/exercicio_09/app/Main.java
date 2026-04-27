package exercicio_09.app;

import exercicio_09.model.Bicycle;
import exercicio_09.model.Car;

public class Main {
    public static void main(String[] args) {
        Car carro = new Car("Fiat", "SUV", 2024);

        Bicycle bicicleta = new Bicycle( "Cinza", "BMX");

        System.out.printf("Carro: %.1f%n", carro.getSpeed());
        System.out.printf("Bicicleta: %.2f%n", bicicleta.getSpeed());

        carro.speedUp(12);
        bicicleta.speedUp(12);

        System.out.printf("Carro acelerando: %.2f%n", carro.getSpeed());
        System.out.printf("Bicicleta acelerando: %.2f%n", bicicleta.getSpeed());
    }
}
