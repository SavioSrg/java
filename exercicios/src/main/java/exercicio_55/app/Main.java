package exercicio_55.app;

import exercicio_55.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente x = new Cliente(1, "Sávio");
        Cliente y = new Cliente(1, "Sávio");
        Cliente z = new Cliente(1, "Sávio");

        boolean reflexiva = x.equals(x);

        boolean simetrica = x.equals(y) == y.equals(x);

        boolean transitiva = x.equals(y) && y.equals(z) && x.equals(z);

        boolean primeira = x.equals(y);
        boolean segunda = x.equals(y);
        boolean terceira = x.equals(y);

        boolean consistente =
                primeira == segunda &&
                        segunda == terceira;

        boolean naoNula = !x.equals(null);

        System.out.println("Reflexiva: " + reflexiva);
        System.out.println("Simétrica: " + simetrica);
        System.out.println("Transitiva: " + transitiva);
        System.out.println("Consistente: " + consistente);
        System.out.println("Não-nulidade: " + naoNula);
    }
}
