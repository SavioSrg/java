package exercicio_04.app;

import exercicio_04.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog cachorro = new Dog("Thor", "Branco");
        System.out.println("nome do Cachorro: " + cachorro.name);
        System.out.println("cor do Cachorro: " + cachorro.color);
    }
}
