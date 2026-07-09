package exercicio_22.app;

import exercicio_22.model.Animal;
import exercicio_22.model.Cachorro;
import exercicio_22.model.Gato;
import exercicio_22.model.Passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Fred");
        Gato gato = new Gato("Mel");
        Passaro passaro = new Passaro("Curiô");

        Animal[] animais = {cachorro, gato, passaro};

        for (Animal animal : animais) {
            animal.emitirSom();
            Animal.correr(animal);
            System.out.println("....".repeat(15));
        }
    }
}
